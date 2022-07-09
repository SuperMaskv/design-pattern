package pers.supermaskv.builder;

public class ProductBuilder01 implements Builder{
    private Product product = new Product();
    @Override
    public void reset() {
        this.product = new Product();
    }

    @Override
    public void buildStepA() {
        this.product.setFeatureA("builder 01 set feature a");
    }

    @Override
    public void buildStepB() {
        this.product.setFeatureB("builder 01 set feature b");
    }

    @Override
    public void buildStepC() {
        this.product.setFeatureC("builder 01 set feature c");
    }

    @Override
    public Product getResult() {
        return this.product;
    }
}
