package com.company;

import com.company.exercise.StatusBar;
import com.company.exercise.Stock;
import com.company.exercise.StockListView;

public class Main {

    public static void main(String[] args) {
//	    var dataSource = new DataSource();
//		var spreadSheet01 = new SpreadSheet(dataSource);
//	    var chart = new Chart(dataSource);
//
//	    dataSource.addObserver(spreadSheet01);
//	    dataSource.addObserver(chart);
//
//	    dataSource.setValue(1);

	    // exercise code.

		var stock01 = new Stock("$", 23);
		var stock02 = new Stock("swe", 33);
		var stock03 = new Stock("stock3", 44);

		var statusBar = new StatusBar();
		var stockList = new StockListView();

		statusBar.addStock(stock01);
		statusBar.addStock(stock02);
		statusBar.addStock(stock03);

		stockList.addStock(stock01);
		stockList.addStock(stock03);

		stock03.addObserver(statusBar);
		stock03.addObserver(stockList);

		stock03.setPrice(23);
		stock03.setPrice(40);
    }
}
