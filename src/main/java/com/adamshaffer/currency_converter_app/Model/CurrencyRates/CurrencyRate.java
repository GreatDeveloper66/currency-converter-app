package com.adamshaffer.currency_converter_app.Model.CurrencyRates;

import java.math.BigDecimal;

public class CurrencyRate {
    private Money amount;
    private BigDecimal rate;

    public CurrencyRate(Money amount, BigDecimal rate) {
        setAmount(amount);
        setRate(rate);
    }

    public CurrencyRate getCurrencyRate() {
        return new CurrencyRate(getAmount(), getRate());
    }

    private void setAmount(Money amount) {
        this.amount = amount;
    }

    private void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    private Money getAmount() {
        return amount;
    }

    private BigDecimal getRate() {
        return rate;
    }

    public CurrencyRate() {
        setAmount(new Money(BigDecimal.ZERO, null));
        setRate(BigDecimal.ZERO);
    }
}
