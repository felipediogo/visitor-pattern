package com.mrholeechit;

import java.util.Random;
/**
 * Created by felipediogo on 28/09/17.
 */
public class Book implements Visitable {

    private static int RANGE_MIN = 1;
    private static int RANGE_MAX = 79;

    private double getBookValue() {
        return RANGE_MIN + (RANGE_MAX- RANGE_MIN) * new Random().nextDouble();
    }

    private double getAuthorValue() {
        return RANGE_MIN + (RANGE_MAX- RANGE_MIN) * new Random().nextDouble();
    }

    public double getValue() {
        return getBookValue() + getAuthorValue();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
