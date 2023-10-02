package miu.edu.cs425.assignment10.JunitAssignment;

import miu.edu.cs425.assignment10.JunitAssignment.service.ArrayFlattenerService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {

    @Test
    public void testReverseArray_ValidInput() {
        // Mock the ArrayFlattenerService
        ArrayFlattenerService mockFlattener = mock(ArrayFlattenerService.class);
        when(mockFlattener.flattenArray(new Integer[][]{{1, 3}, {0}, {4, 5, 9}}))
                .thenReturn(new Integer[]{1, 3, 0, 4, 5, 9});

        ArrayReversor reversor = new ArrayReversor(mockFlattener);

        Integer[] expectedOutput = {9, 5, 4, 0, 3, 1};
        assertArrayEquals(expectedOutput, reversor.reverseArray(new Integer[][]{{1, 3}, {0}, {4, 5, 9}}));
    }

    @Test
    public void testReverseArray_NullInput() {
        ArrayFlattenerService mockFlattener = mock(ArrayFlattenerService.class);
        when(mockFlattener.flattenArray(null)).thenReturn(null);

        ArrayReversor reversor = new ArrayReversor(mockFlattener);
        assertNull(reversor.reverseArray(null));
    }


}
