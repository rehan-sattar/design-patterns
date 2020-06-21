package com.company.exercise;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void priceChanged() {
        System.out.println("Update by stock price: " );
        show();
    }
}