package com.currencytrade.main;

import com.currencytrade.exceptions.ErrorCurrencyOption;
import com.currencytrade.exceptions.ErrorCurrencyValue;
import com.currencytrade.models.Convert;
import com.currencytrade.services.CurrencyService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyService currencyService = new CurrencyService();
        System.out.println("*** NK Currency Trade™ ***\n");

        while (true) {
            try {
                int originCurrencyOption = currencyService.getOriginCurrencyOption(scanner);
                int destinationCurrency = currencyService.getDestinationCurrency(scanner);

                if (originCurrencyOption == 7 || destinationCurrency == 7) {
                    break;
                }

                double valueConversion = currencyService.getValueConversion(scanner);
                Convert conversionResult = currencyService.convertCurrency(originCurrencyOption
                        , destinationCurrency
                        , valueConversion);

                if (conversionResult != null) {
                    System.out.println("\nO valor "+ String.format("%.2f", valueConversion) + conversionResult);
                } else {
                    System.out.println("Erro ao converter a moeda. Tente novamente.");
                }
            } catch (ErrorCurrencyOption | ErrorCurrencyValue e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida. Por favor, tente novamente.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
