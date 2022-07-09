package pers.supermaskv.builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ProductBuilder01();
        Director director = new Director(builder);
        Product product = director.make("");
        System.out.println("product = " + product);

        director.changeBuilder(new ProductBuilder02());
        Product simple = director.make("simple");
        System.out.println("simple = " + simple);
    }
}
