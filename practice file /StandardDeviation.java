public class StandardDeviation {

    public static void main(String [] args){

   int [] numbers = {3,7,8,9,4,6,3,6,};
    System.out.print(calculateStandardDeviation(numbers));
 
    }
    
    
    public static int calculateStandardDeviation(int [] number){
   int sum = 0;
    for (int count = 1; count < number.length; count++){
    sum += number[count];
    }
    int mean = sum/number.length;
    int square = 0;
    for (int count = 0; count < number.length; count++){
    int num = number[count] - mean;
    square += num * num;
    }
    int variance = square/(number.length - 1);
    int standard = Math.sqrt(variance);
    
    
   return standard;
    }
   
    }
   
    
    
