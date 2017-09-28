package com.mrholeechit;

import java.util.Random;

/**
 * Created by felipediogo on 28/09/17.
 */
public class Eletronic implements Visitable {

    private static int RANGE_MIN = 1;
    private static int RANGE_MAX = 40;

    private double getEletronicBaseValue() {
        return RANGE_MIN + (RANGE_MAX- RANGE_MIN) * new Random().nextDouble();
    }

    private double getEletronicWeight() {
        return RANGE_MIN + (RANGE_MAX- RANGE_MIN) * new Random().nextDouble();
    }

    private double getEletronicCompanyRoyalty() {
        return RANGE_MIN + (RANGE_MAX- RANGE_MIN) * new Random().nextDouble();
    }

    public double getValue() {
        return (getEletronicBaseValue() * getEletronicWeight()) + getEletronicCompanyRoyalty();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
