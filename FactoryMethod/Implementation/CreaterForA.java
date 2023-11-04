package FactoryMethod.Implementation;

import FactoryMethod.Interface.Creator;
import FactoryMethod.Interface.Product;

public class CreaterForA implements Creator {

    @Override
    public Product productFactory() {
       return new ProductA();
    }
    
}
