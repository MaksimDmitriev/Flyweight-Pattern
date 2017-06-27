package com.api;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private final Map<Integer, Flyweight> flyweights = new HashMap<>();

    Flyweight getFlyweight(int key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight == null) {
            // create a new flyweight
        }
        return flyweight;
    }
}
