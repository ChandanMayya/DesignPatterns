package FactoryMethod.Implementation;

import FactoryMethod.Interface.Creator;
import FactoryMethod.Interface.Product;

public class CreaterForB implements Creator {

    @Override
    public Product productFactory() {
      return new ProductB();
    }
    
}
