package FactoryMethod.Implementation;

import FactoryMethod.Interface.Product;

public class ProductA implements Product {

    @Override
    public void create() {
        System.out.println("Create Product A");
    }
    
}
