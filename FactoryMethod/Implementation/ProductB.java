package FactoryMethod.Implementation;

import FactoryMethod.Interface.Product;

public class ProductB implements Product{

    @Override
    public void create() {
        System.out.println("Create Product B");
    }
    
}
