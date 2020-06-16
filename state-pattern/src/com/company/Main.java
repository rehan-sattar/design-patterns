package com.company;

import com.company.exsercise.DirectionService;
import com.company.exsercise.DrivingMode;

public class Main {

    public static void main(String[] args) {
        // Exercise code.
        DirectionService directionService = new DirectionService();
        directionService.getDirection();
        directionService.getEta();
        directionService.setCurrentCurrentMode(new DrivingMode());
        directionService.getDirection();
        directionService.getEta();
        // Example code.
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
