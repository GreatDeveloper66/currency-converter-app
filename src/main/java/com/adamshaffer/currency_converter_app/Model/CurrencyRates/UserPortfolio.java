package com.adamshaffer.currency_converter_app.Model.CurrencyRates;


import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class UserPortfolio {
    private List<Money> moneyList;
    private CurrencyFactory currencyFactory;
    

    public UserPortfolio() {
        this.moneyList = new ArrayList<>();
        this.currencyFactory = new CurrencyFactory();
    }

    public UserPortfolio(List<Money> moneyList) {
        this.moneyList = moneyList;
        this.currencyFactory = new CurrencyFactory();
    }
    private List<Money> getMoneyList() {
        if (moneyList == null) {
            moneyList = new ArrayList<>();
        }
        return moneyList;
    }
    
    public void addMoney(BigDecimal amount, String currencyCode) {
        try {
            Money money = currencyFactory.createMoney(amount, currencyCode);
            List<Money> oldMoneyList = getMoneyList();
            if (oldMoneyList == null) {
                oldMoneyList = new ArrayList<>();
            } 
            oldMoneyList.add(money);
            List<Money> mewMoneyList = oldMoneyList;
            setMoneyList(mewMoneyList);
        } catch (Exception e) {
            // Handle exception (e.g., invalid currency code)
        }
    }

    private void setMoneyList(List<Money> mewMoneyList) {
        this.moneyList = mewMoneyList;
    }

    
        


   
}
