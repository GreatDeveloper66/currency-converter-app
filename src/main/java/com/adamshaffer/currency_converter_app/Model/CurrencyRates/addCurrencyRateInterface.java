package com.adamshaffer.currency_converter_app.Model.CurrencyRates;

import java.math.BigDecimal;

public interface addCurrencyRateInterface {
    void addCurrencyRate(Money amount, BigDecimal rate); // Method to add a currency rate
    void addMoney(Money amount); // Method to add a money amount
}
