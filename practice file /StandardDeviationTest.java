import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
        public void testThatFunctionShouldAddTheSumOfNumbersToGiveSum(){
        
        int numbers [] = {2,5,7,8,9,5};
        int expected = 36;
        int actual = StandardDeviation.calculateStandardDeviation(numbers);
        
              
        assertEquals(expected,actual);
    
        
        }

