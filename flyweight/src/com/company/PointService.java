package com.company;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private final PointIconFactory pointIconFactory;

    public PointService(PointIconFactory pointIconFactory) {
        this.pointIconFactory = pointIconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        Point point = new Point(1, 2, pointIconFactory.getPointIcon(PointType.CAFE));
        points.add(point);
        return points;
    }

}
