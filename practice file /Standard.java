public class Standard {

    public static void main(String [] args){

   int [] numbers = {3,7,8,9,4,6,3,6,};
    System.out.print(calculateStandardDeviation(numbers));
 
    }
    
    
    public static double calculateStandardDeviation(int [] number){
   int sum = 0;
    for (int count = 1; count < number.length; count++){
    sum += number[count];
    }
    double mean = sum/number.length;
    double square = 0;
    for (int count = 0; count < number.length; count++){
    double num = number[count] - mean;
    square += num * num;
    }
    double variance = square/(number.length - 1);
    double standard = Math.sqrt(variance);
    
    
   return standard;
    }
   
    }
   
    
    
