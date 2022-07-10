package pers.supermaskv.iterator;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
