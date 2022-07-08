package pers.supermaskv.strategy;

public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int o1Value = o1;
        int o2Value = o2;
        if (o1Value == o2Value) {
            return 0;
        } else if (o1Value > o2Value) {
            return 1;
        } else {
            return -1;
        }
    }
}
