package com.adamshaffer.currency_converter_app.Model.CurrencyRates;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CurrencyMarket {
    private static List<CurrencyRate> currencyRates;
    private static String baseCurrency;
    private static CurrencyFactory currencyFactory;

    public static void setCurrencyMarket(List<CurrencyRate> currencyRates, String baseCurrency) {
        CurrencyMarket.currencyRates = currencyRates;
        CurrencyMarket.baseCurrency = baseCurrency;
        currencyFactory = new CurrencyFactory();
    }

    public static void setCurrencyMarket(String baseCurrency) {
        CurrencyMarket.baseCurrency = baseCurrency;
        CurrencyMarket.currencyRates = new ArrayList<>();
        currencyFactory = new CurrencyFactory();
    }

    public static void setCurrencyMarket() {
        CurrencyMarket.currencyRates = new ArrayList<>();
        CurrencyMarket.baseCurrency = "USD";
        currencyFactory = new CurrencyFactory();
    }

   

    public void addCurrencyRate(Money amount, BigDecimal rate) {
        if (currencyRates == null) {
            currencyRates = new ArrayList<>();
        }
        CurrencyRate newCurrencyRate = currencyFactory.createCurrencyRate(amount, rate);
        List<CurrencyRate> newCurrencyRates = getCurrencyRates();
        newCurrencyRates.add(newCurrencyRate);
        setCurrencyRates(newCurrencyRates);

    }

    private void setCurrencyRates(List<CurrencyRate> newCurrencyRates) {
        if (currencyRates == null) {
            currencyRates = new ArrayList<>();
        }
        currencyRates.clear();
        currencyRates.addAll(newCurrencyRates);
    }

    private List<CurrencyRate> getCurrencyRates() {
        if (currencyRates == null) {
            currencyRates = new ArrayList<>();
        }
        return currencyRates;
    }

    
    
    
}
