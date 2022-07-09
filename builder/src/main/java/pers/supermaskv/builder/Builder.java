package pers.supermaskv.builder;

public interface Builder {
    void reset();
    void buildStepA();
    void buildStepB();
    void buildStepC();
    Product getResult();
}
