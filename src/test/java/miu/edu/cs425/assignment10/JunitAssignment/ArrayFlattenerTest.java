package miu.edu.cs425.assignment10.JunitAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ArrayFlattenerTest {
    @Test
    public void testFlattenArray_ValidInput() {
        ArrayFlattener flattener = new ArrayFlattener();
        Integer[][] input = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] expectedOutput = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expectedOutput, flattener.flattenArray(input));
    }

    @Test
    public void testFlattenArray_NullInput() {
        ArrayFlattener flattener = new ArrayFlattener();
        assertNull(flattener.flattenArray(null));
    }
}
