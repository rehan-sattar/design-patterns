package com.company;

import com.company.araFilters.Caramel;

public class Main {

    public static void main(String[] args) {
        Image image = new Image();
	    ImageView view = new ImageView(image);
	    view.apply(new CaramelFilter(new Caramel()));

    }
}
