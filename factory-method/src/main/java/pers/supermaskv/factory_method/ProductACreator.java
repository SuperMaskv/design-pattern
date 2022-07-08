package pers.supermaskv.factory_method;

/**
 * @author xugr
 */
public class ProductACreator extends Creator {
    @Override
    Product createProduct() {
        return new ProductA();
    }
}
