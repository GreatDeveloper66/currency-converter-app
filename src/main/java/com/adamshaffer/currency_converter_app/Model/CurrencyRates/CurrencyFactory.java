package com.adamshaffer.currency_converter_app.Model.CurrencyRates;

import java.math.BigDecimal;
import java.util.Currency;

public class CurrencyFactory implements createCurrencyInterface {

    @Override
    public Money createMoney(BigDecimal amount, String currencyCode) {
        return new Money(amount, Currency.getInstance(currencyCode));
    }

    @Override
    public CurrencyRate createCurrencyRate(Money amount, BigDecimal rate) {
        return new CurrencyRate(amount, rate);
    }

    
}
