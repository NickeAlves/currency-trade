package com.currencytrade.models;

import com.google.gson.annotations.SerializedName;

public class Convert {
    @SerializedName("conversion_result")
    private double conversionResult;

    @SerializedName("base_code")
    private String baseCode;

    @SerializedName("target_code")
    private String targetCode;

    @Override
    public String toString() {
        return " ("
                + baseCode
                +")"
                + " corresponde a "
                + String.format("%.2f", conversionResult)
                + " ("
                + targetCode
                + ").\n";
    }
}
