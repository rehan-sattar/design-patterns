package com.company;

public class Main {

    public static void main(String[] args) {
	    var spreadSheet01 = new SpreadSheet();
	    var dataSource = new DataSource();
	    var chart = new Chart();

	    dataSource.addObserver(spreadSheet01);
	    dataSource.addObserver(chart);

	    dataSource.setValue(2);

    }
}
