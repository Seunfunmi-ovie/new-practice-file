import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFourteenTest{

@Test

        public void testThatFunctionAddAllPositiveIntegerInAnArray(){
        
        int [] numbers = {2,4,5,7,-6,7,-7,6,9,-66};
        int expected = 7;
        int actual = ArrayFourteen.getPositive(numbers);
        
        assertEquals(expected,actual);
        
        }
    @Test    
        
        public void testThatFunctionRemoveTheNumberZeroFromThePositiveIntegerCount(){
        
        int [] numbers = {2,4,5,7,-6,7,0,0,9,-66};
        int expected = 6;
        int actual = ArrayFourteen.getPositive(numbers);
        
        assertEquals(expected,actual);
        
        }
}
