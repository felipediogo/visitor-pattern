package com.mrholeechit;

/**
 * Created by felipediogo on 28/09/17.
 */
public class ShipVisitor implements Visitor {
    private double shipValue = 0;
    @Override
    public void visit(Book book) {
        shipValue +=book.getValue();
    }

    @Override
    public void visit(Furniture furniture) {
        shipValue +=furniture.getValue();
    }

    @Override
    public void visit(Eletronic eletronic) {
        shipValue +=eletronic.getValue();
    }

    public double getValue() {
        return shipValue;
    }
}
