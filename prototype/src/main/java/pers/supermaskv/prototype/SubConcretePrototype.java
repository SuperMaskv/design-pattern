package pers.supermaskv.prototype;

public class SubConcretePrototype extends ConcretePrototype {
    protected String subField;

    public SubConcretePrototype(String field, String subField) {
        super(field);
        this.subField = subField;
    }

    public SubConcretePrototype(SubConcretePrototype subConcretePrototype) {
        super(subConcretePrototype);
        this.subField = subConcretePrototype.subField;
    }

    @Override
    public Prototype clonePrototype() {
        return new SubConcretePrototype(this);
    }

    @Override
    public String toString() {
        return "SubConcretePrototype{" +
                "subField='" + subField + '\'' +
                ", filed='" + field + '\'' +
                '}';
    }


}
