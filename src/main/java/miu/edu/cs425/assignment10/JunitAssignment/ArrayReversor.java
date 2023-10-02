package miu.edu.cs425.assignment10.JunitAssignment;

import miu.edu.cs425.assignment10.JunitAssignment.service.ArrayFlattenerService;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ArrayReversor {

    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public Integer[] reverseArray(Integer[][] input) {
        Integer[] flattened = flattenerService.flattenArray(input);
        if (flattened == null) {
            return null;
        }
        List<Integer> reversedList = Arrays.asList(flattened);
        Collections.reverse(reversedList);
        return reversedList.toArray(new Integer[0]);
    }
}

