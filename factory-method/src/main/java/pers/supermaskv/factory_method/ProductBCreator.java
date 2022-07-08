package pers.supermaskv.factory_method;

/**
 * @author xugr
 */
public class ProductBCreator extends Creator {
    @Override
    Product createProduct() {
        return new ProductB();
    }
}
