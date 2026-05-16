
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
     
        int[] numbers = new int[10];
        
        System.out.println("Please enter 10 integers:");
        
     
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();         
        
       
        System.out.print("You entered: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }
        
     
    }

}}


      
