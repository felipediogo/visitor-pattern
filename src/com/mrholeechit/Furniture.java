package com.mrholeechit;

import java.util.Random;

/**
 * Created by felipediogo on 28/09/17.
 */
public class Furniture implements Visitable {

    private static int RANGE_MIN = 1;
    private static int RANGE_MAX = 58;

    private double getFurnitureBaseValue() {
        return RANGE_MIN + (RANGE_MAX- RANGE_MIN) * new Random().nextDouble();
    }

    private double getFurnitureWeight() {
        return RANGE_MIN + (RANGE_MAX- RANGE_MIN) * new Random().nextDouble();
    }

    public double getValue() {
        return getFurnitureBaseValue() * getFurnitureWeight();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
