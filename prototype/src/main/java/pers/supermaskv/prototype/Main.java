package pers.supermaskv.prototype;

public class Main {
    public static void main(String[] args) {
        SubConcretePrototype prototype = new SubConcretePrototype("ashdfas", "a321a3s5df4");
        Prototype newPrototype = prototype.clonePrototype();
        System.out.println("newPrototype = " + newPrototype);
        System.out.println(prototype == newPrototype);
    }
}
