import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTenTest{

@Test

        public void testTheProductOfAnArray(){
        int [] numbers = {3,5,8,9,9};
        int expected = 234;
        int actual = ArrayTen.getProduct(numbers);
        
        AssertEquals(expected,actual);
        
        }
        }


