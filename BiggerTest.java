import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BiggerTest{
 @Test
    public void testThatTheRangeOfNumbers(){
        int [] numbers = {2, 5, 7, 9, 20};
        int expectedRange = 18;
        int actualRange = Bigger.getRangeOf(numbers);
        assertEquals(actualRange, expectedRange);
    } 
