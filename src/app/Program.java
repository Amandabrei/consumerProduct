package app;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Hd Case", 80.90));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //list.forEach(new PriceUpdate()); //forma usando implementando interface

        //list.forEach(Product :: staticPriceUpdate);//essa forma usa reference method versao static

        //list.forEach(Product :: nonstaticPriceUpdate);//essa forma usa reference method versao nao static

        //list.forEach(System.out :: println);

        double factor = 1.1;
        //Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor); //usa lambda declarada
        //list.forEach(cons);

        list.forEach(p -> p.setPrice(p.getPrice() * factor)); //usa lambda inline
        list.forEach(System.out :: println);

    }
}
