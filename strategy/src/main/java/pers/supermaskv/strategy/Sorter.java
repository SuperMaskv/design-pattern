package pers.supermaskv.strategy;

/**
 * @author xugr
 */

public class Sorter {
    public static <T> void insertSort(T[] arr, Comparator<T> comparator) {
        int len = arr.length;
        if (len < 2) {
            return;
        }
        for (int i = 1; i < len; i++) {
            int newEleIndex = i;
            while (newEleIndex > 0 && comparator.compare(arr[newEleIndex - 1], arr[newEleIndex]) == 1) {
                T temp = arr[newEleIndex];
                arr[newEleIndex] = arr[newEleIndex - 1];
                arr[newEleIndex - 1] = temp;
                newEleIndex--;
            }
        }
    }
}
