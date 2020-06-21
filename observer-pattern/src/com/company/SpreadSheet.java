package com.company;

public class SpreadSheet implements Observer {
    private  DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Got the change in the spreadSheet.." + dataSource.getValue());
    }
}
