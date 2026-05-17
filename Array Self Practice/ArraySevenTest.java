import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySevenTest{


@Test
        public void testThatTheNumberOnAnArrayLIstIsTheSmallest{
        
        int number[count] = {9,2,1,100,5,6};
        int expected = 1;
        int actual = ArraySeven.getSmallest(numbers);
        
        assertEquals(expected,actual);

        }


