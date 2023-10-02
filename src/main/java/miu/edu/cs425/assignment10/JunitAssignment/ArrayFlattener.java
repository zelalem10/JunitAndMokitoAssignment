package miu.edu.cs425.assignment10.JunitAssignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public Integer[] flattenArray(Integer[][] nestedArray) {
        if (nestedArray == null) {
            return null;
        }

        List<Integer> flatList = new ArrayList<>();
        for (Integer[] subArray : nestedArray) {
            for (Integer num : subArray) {
                flatList.add(num);
            }
        }

        return flatList.toArray(new Integer[0]);
    }

}
