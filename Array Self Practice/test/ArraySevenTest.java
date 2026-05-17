import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySevenTest{


@Test
        public void testThatTheNumberOnAnArrayLIstIsTheSmallest(){
        
        int[] numbers = {9,2,1,100,5,6};
        int expected = 1;
        int actual = ArraySeven.getSmallest(numbers);
        
        assertEquals(expected,actual);

        }
        
@Test        
     public void testThatTheSmallGiveANegtiveNumberIfItExistInMyArray(){
     
     int[] numbers = {-1,9,1,5,100};
     int expected = -1;
     int actual = ArraySeven.getSmallest(numbers);
     
     assertEquals(expected,actual);
     }   
        
   
@Test
       public void testThatSmallestNUmberShowsIfThereIsADuplicateNumber(){
       int[] numbers = {1,1,5,100};
       int expected = 1;
       int actual = ArraySeven.getSmallest(numbers);
       assertEquals(expected,actual);
       }        
        
        }


