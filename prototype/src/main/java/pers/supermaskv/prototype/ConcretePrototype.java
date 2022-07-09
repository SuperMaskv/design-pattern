package pers.supermaskv.prototype;

public class ConcretePrototype implements Prototype {
    protected String field = "concrete prototype field";

    public ConcretePrototype(String field) {
        this.field = field;
    }

    public ConcretePrototype(ConcretePrototype concretePrototype) {
        this.field = concretePrototype.field;
    }

    @Override
    public Prototype clonePrototype() {
        return new ConcretePrototype(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "filed='" + field + '\'' +
                '}';
    }
}
