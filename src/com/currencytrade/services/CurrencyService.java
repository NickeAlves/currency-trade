package com.currencytrade.services;

import com.currencytrade.exceptions.ErrorCurrencyOption;
import com.currencytrade.exceptions.ErrorCurrencyValue;
import com.currencytrade.models.Convert;

import java.util.Scanner;

public class CurrencyService {
    ApiService apiService = new ApiService();

    public int getCurrencyOption(Scanner scanner) throws ErrorCurrencyOption {

        System.out.println("1) USD -> BRL\n"
                + "2) BRL -> USD\n"
                + "3) ARS -> BRL\n"
                + "4) BRL -> ARS\n"
                + "5) EUR -> BRL\n"
                + "6) BRL -> EUR\n"
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

    public Convert convertCurrency(int conversionOption, double valueToConvert) {
        return apiService.fetchConversion(conversionOption, valueToConvert);
    }
}
