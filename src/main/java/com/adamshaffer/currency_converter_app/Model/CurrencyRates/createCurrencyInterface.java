package com.adamshaffer.currency_converter_app.Model.CurrencyRates;

import java.math.BigDecimal;

public interface createCurrencyInterface {
    Money createMoney(BigDecimal amount, String currencyCode); // Method to create a Money object
    CurrencyRate createCurrencyRate(Money amount, BigDecimal rate); // Method to create a CurrencyRate object
}
