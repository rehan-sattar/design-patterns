package com.company;

public class Main {

    public static void main(String[] args) {
	    var dataSource = new DataSource();
		var spreadSheet01 = new SpreadSheet(dataSource);
	    var chart = new Chart(dataSource);

	    dataSource.addObserver(spreadSheet01);
	    dataSource.addObserver(chart);

	    dataSource.setValue(1);

    }
}
