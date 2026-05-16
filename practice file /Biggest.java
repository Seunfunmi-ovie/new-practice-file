public class Biggest {
    public static void main(String[] args) {
    
    int [] numbers = new int [5];
    
   numbers[0] = 2;
   numbers[1] = 5;
   numbers[2] = 7;
   numbers[3] = 9;
   numbers[4] = 20;
   
   
   for(int count = 0; count < numbers.length; count++){
   
   System.out.print(numbers[count] + " ");
   
   
   }
       int largest = 0;
    largest = numbers[4] - numbers[0];
    System.out.println("The range is " + largest);   
   }
   }
