package com.currencytrade.services;

import com.currencytrade.models.Convert;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {
    private final String baseUrl = "https://v6.exchangerate-api.com/v6/630e6bb8592dfe9f73579f8f/pair/";

    public Convert fetchConversion(int originCurrencyOption, int destinationCurrency, double valueConversion) {
        Convert conversion = new Convert();

        String fullUrl = getUrl(originCurrencyOption, destinationCurrency, valueConversion);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(fullUrl))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            if (json.contains("\"error\"")) {
                System.out.println("Erro na requisisão. Por favor, tente novamente.");
                return null;
            } else {
                Gson gson = new Gson();
                conversion = gson.fromJson(json, Convert.class);
                return conversion;
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

    private String getUrl(int originCurrencyOption, int destinationCurrency, double valueConversion) {
        String baseCurrencyPair = switch (originCurrencyOption) {
            case 1 -> "ARS/";
            case 2 -> "BRL/";
            case 3 -> "EUR/";
            case 4 -> "USD/";
            case 5 -> "SAR/";
            case 6 -> "JPY/";
            default -> throw new IllegalArgumentException("Opção inválida.");
        };

        String destinationCurrencyPair = switch (destinationCurrency) {
            case 1 -> "ARS/";
            case 2 -> "BRL/";
            case 3 -> "EUR/";
            case 4 -> "USD/";
            case 5 -> "SAR/";
            case 6 -> "JPY/";
            default -> throw new IllegalArgumentException("Opção inválida.");
        };

        return baseUrl + baseCurrencyPair + destinationCurrencyPair + valueConversion;
    }
}
