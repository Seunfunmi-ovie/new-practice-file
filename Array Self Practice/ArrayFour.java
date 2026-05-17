import java.util.Scanner;
public class ArrayFour{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number; ");
int number = input.nextInt();
int [] numbers = new int [number];
int totalAverage = averageArray(numbers,input);
    System.out.print("The average number: " + totalAverage);


}
        public static int averageArray(int [] numbers, Scanner input){
        int sum = 0;
        for(int count = 0; count < numbers.length; count++){
        
        System.out.print("Enter number: ");
         numbers[count] = input.nextInt();
        sum += numbers[count];
        
        }
        
       int average = sum/numbers.length;
       return average; 
       
        }

}
