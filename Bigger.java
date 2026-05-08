public class Bigger {
    public static void main(String[] args) {
    
    int [] numbers = new int [5];
    
   numbers[0] = 2;
   numbers[1] = 3;
   numbers[2] = 1;
   numbers[3] = 4;
   numbers[4] = 6;
   
   
   for(int count = 0; count < numbers.length; count++){
   
   System.out.print(numbers[count] + " ");
   
   
   }
       int largest = 0;
    largest = numbers[4] - numbers[2];
    System.out.println("The range is " + largest);   
   }
   }
