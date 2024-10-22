package com.currencytrade.services;

import com.currencytrade.exceptions.ErrorCurrencyOption;
import com.currencytrade.exceptions.ErrorCurrencyValue;
import com.currencytrade.models.Convert;

import java.util.Scanner;

public class CurrencyService {
    ApiService apiService = new ApiService();

    public int getOriginCurrencyOption(Scanner scanner) throws ErrorCurrencyOption {

        System.out.println("Moeda de origem:\n"
                + "1) ARS (Argentine Peso)\n"
                + "2) BRL (Brazilian Real)\n"
                + "3) EUR (Euro) \n"
                + "4) USD (United States Dollar)\n"
                + "5) SAR (Saudi Riyal)\n"
                + "6) JPY (Japanese Yen)\n"
                + "7) Sair\n");
        System.out.print("Selecione a opção desejada: ");

        int option = scanner.nextInt();

        if (option < 1 || option > 7) {
            throw new ErrorCurrencyOption("Opção inválida! Escolha a opção entre 1 e 7.");
        }

        return option;
    }

    public int getDestinationCurrency(Scanner scanner) throws ErrorCurrencyOption {
        System.out.println("Moeda de destino:\n"
                + "1) ARS (Argentine Peso)\n"
                + "2) BRL (Brazilian Real)\n"
                + "3) EUR (Euro) \n"
                + "4) USD (United States Dollar)\n"
                + "5) SAR (Saudi Riyal)\n"
                + "6) JPY (Japanese Yen)\n"
                + "7) Sair\n");
        System.out.print("Selecione a opção desejada: ");

        int option = scanner.nextInt();

        if (option < 1 || option > 7) {
            throw new ErrorCurrencyOption("Opção inválida! Escolha a opção entre 1 e 7.");
        }

        return option;

    }

    public double getValueConversion(Scanner scanner) throws ErrorCurrencyValue {
        System.out.print("Digite o valor a ser convertido: ");
        double value = scanner.nextDouble();

        if (value <= 0) {
            throw new ErrorCurrencyValue("Valor inválido! O valor deve ser maior do que zero.");
        }
        return value;
    }

    public Convert convertCurrency(int originCurrencyOption, int destinationCurrency, double valueConversion) {
        return apiService.fetchConversion(originCurrencyOption, destinationCurrency, valueConversion);
    }
}
