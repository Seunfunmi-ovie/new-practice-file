import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTwelveTest{

@ Test

public void testThatFunctionAddAllOddIndexInAnArray(){

    int[] numbers = {4,8,7,9,4,8,6,5,9,8};
    int expected =23;
    int actual = ArrayTwelve.getOddIndex(numbers);
    
    assertEqual(expected,actual);
    
    }
}

