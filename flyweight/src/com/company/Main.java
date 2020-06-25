package com.company;

public class Main {

    public static void main(String[] args) {
	    PointService service = new PointService(new PointIconFactory());
	    for(Point point : service.getPoints()) {
	        point.draw();
        }
    }
}
