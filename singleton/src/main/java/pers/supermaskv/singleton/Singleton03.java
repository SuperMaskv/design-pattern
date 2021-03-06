package pers.supermaskv.singleton;

/**
 * @author xugr
 */
public class Singleton03 {
    private Singleton03() {
    }

    private static class Holder {
        private static final Singleton03 INSTANCE = new Singleton03();
    }

    public Singleton03 getInstance() {
        return Holder.INSTANCE;
    }
}
