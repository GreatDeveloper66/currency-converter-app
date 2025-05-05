package com.adamshaffer.currency_converter_app.Controller;

public class FrankfurterLive {
    private String baseCurrency;
    private String targetCurrency;
    private double exchangeRate;
    private String lastUpdated;
    private String FrankfurterOpenSourceAPI = "https://api.frankfurter.dev/";

    public FrankfurterLive(String baseCurrency, String targetCurrency, double exchangeRate, String lastUpdated) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.exchangeRate = exchangeRate;
        this.lastUpdated = lastUpdated;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
}