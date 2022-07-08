package pers.supermaskv.singleton;

/**
 * @author xugr
 */
public class Singleton01 {
    private Singleton01() {
    }

    private static final Singleton01 INSTANCE = new Singleton01();

    public Singleton01 getInstance() {
        return INSTANCE;
    }
}
