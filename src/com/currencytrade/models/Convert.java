package com.currencytrade.models;

import com.google.gson.annotations.SerializedName;

public class Convert {
    @SerializedName("conversion_result")
    private double conversionResult;

    @SerializedName("base_code")
    private String baseCode;

    @SerializedName("target_code")
    private String targetCode;

    public double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(double conversionResult) {
        this.conversionResult = conversionResult;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    @Override
    public String toString() {
        return " ("
                + baseCode
                +")"
                + " corresponde a "
                + conversionResult
                + " ("
                + targetCode
                + ").\n";
    }
}
