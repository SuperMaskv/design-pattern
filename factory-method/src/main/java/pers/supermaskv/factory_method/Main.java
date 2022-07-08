package pers.supermaskv.factory_method;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ProductBCreator();
        Product product = creator.createProduct();
        product.doStuff();
    }
}
