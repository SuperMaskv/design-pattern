package pers.supermaskv.builder;

public class ProductBuilder02 implements Builder {
    private Product product = new Product();

    @Override
    public void reset() {
        this.product = new Product();
    }

    @Override
    public void buildStepA() {
        this.product.setFeatureA("builder 02 set feature a");
    }

    @Override
    public void buildStepB() {
        this.product.setFeatureB("builder 02 set feature b");
    }

    @Override
    public void buildStepC() {
        this.product.setFeatureC("builder 02 set feature c");
    }

    @Override
    public Product getResult() {
        return this.product;
    }
}
