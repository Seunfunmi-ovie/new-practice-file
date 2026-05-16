
import java.util.Scanner; 
public class Sum {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter the number: ");
    int number = input.nextInt();
    int[] numbers = new int[number];
    System.out.print("Enter number: ");
    int sum = 0;
    for(int count = 0; count < number; count++){
    numbers[count] = input.nextInt();
    
    
    sum += numbers[count]; 
   }
        
    System.out.print("The Sum number is " + sum);
    
    }
    
    }
    
