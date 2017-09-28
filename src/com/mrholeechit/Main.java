package com.mrholeechit;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static ArrayList<Visitable> shoppingCart = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here
        Visitable item;
        ShipVisitor visitor = new ShipVisitor();
        for (int i= 0; i < 10; ++i) {
            int randomInt = new Random().nextInt(3) + 1;
            switch (randomInt) {
                case 1:
                    item = new Book();
                    shoppingCart.add(item);
                    break;
                case 2:
                    item = new Eletronic();
                    shoppingCart.add(item);
                    break;
                case 3:
                    item = new Furniture();
                    shoppingCart.add(item);
                    break;
            }
        }

        for (int i= 0; i < 10; ++i) {
            shoppingCart.get(i).accept(visitor);
        }

        System.out.println(String.format("This is the total value of the shipping: %1$,.2f", visitor.getValue()));
    }
}
