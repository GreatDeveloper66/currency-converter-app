package com.adamshaffer.currency_converter_app.Model.CurrencyRates;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;

public class Money {
    private final BigDecimal amount;
    private final Currency currency;
    

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount.setScale(currency.getDefaultFractionDigits(), RoundingMode.HALF_EVEN);
        this.currency = currency;
    }
    public Money convert(BigDecimal rate, Currency targetCurrency) {
        BigDecimal converted = amount.multiply(rate);
        return new Money(converted, targetCurrency);
    }

    @Override
    public String toString() {
        return amount + " " + currency.getCurrencyCode();
    }
    
}
