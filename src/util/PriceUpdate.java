package util;

import entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> { //forma usando implementando interface

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

}
