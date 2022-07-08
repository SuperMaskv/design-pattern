package pers.supermaskv.singleton;

/**
 * @author xugr
 */
public class Singleton02 {
    private Singleton02() {
    }

    private static volatile Singleton02 INSTANCE;

    public Singleton02 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton02.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton02();
                }
            }
        }
        return INSTANCE;
    }
}
