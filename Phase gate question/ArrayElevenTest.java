import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayElevenTest{

@Test

    public void testThatFunctionCanCalculateTheEvenIndexOfAnArray(){
    
        int [] numbers = {2,8,9,5,3,9,8,4,0,8};
        int expected = 29;
        int actual = ArrayEleven.getSum(numbers);
        
      assertEquals(expected,actual);
      
      
      }  
    }

