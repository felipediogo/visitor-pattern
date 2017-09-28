package com.mrholeechit;

/**
 * Created by felipediogo on 28/09/17.
 */
public interface Visitor {
    void visit(Book book);
    void visit(Furniture furniture);
    void visit(Eletronic eletronic);
}
