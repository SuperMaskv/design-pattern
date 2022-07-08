package pers.supermaskv.strategy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Integer[] arr = new Integer[]{3, 4, 4, 6, 77, 8, 1, 34, 1, 54, 35};
        Sorter.insertSort(arr, new IntegerComparator());
        System.out.println(mapper.writeValueAsString(arr));

        Sorter.insertSort(arr, (o1, o2) -> {
            if (o1.equals(o2)) return 0;
            else if (o1 > o2) return -1;
            else return 1;
        });
        System.out.println(mapper.writeValueAsString(arr));
    }
}
