package FactoryMethod;

import FactoryMethod.Implementation.CreaterForA;
import FactoryMethod.Implementation.CreaterForB;
import FactoryMethod.Interface.Product;

public class FactoryMethodExample {
    public static void main(String[] args) {
        CreaterForA createrForA = new CreaterForA();
        Product productA = createrForA.productFactory();
        productA.create();

        CreaterForB createrForB = new CreaterForB();
        Product productB = createrForB.productFactory();
        productB.create();
    }
}
