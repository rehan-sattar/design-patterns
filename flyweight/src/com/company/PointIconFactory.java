package com.company;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if(!icons.containsKey(type)) {
            PointIcon icon = new PointIcon(type, null);
            icons.put(type, icon);
        }
        return icons.get(type);
    }
}
