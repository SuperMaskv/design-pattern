package pers.supermaskv.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product make(String type) {
        builder.reset();
        if ("simple".equals(type)) {
            builder.buildStepA();
        } else {
            builder.buildStepB();
            builder.buildStepC();
        }
        return builder.getResult();
    }
}
