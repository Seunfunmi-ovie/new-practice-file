import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayNineTest{


@Test

    public void testThatReversedOfA_NumberInAnArray(){
    
    int [] numbers = {4,6,7,7,4,3,5,3};
    int[] expected = {3,5,3,4,7,7,6,4};
    int[] actual = ArrayNine.getReversed(numbers);
    
    assertArrayEquals(actual,expected);
    
    }
   
    
    }
