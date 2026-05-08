
import java.util.Scanner; 
import java.util.Arrays;
public class Acending {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter the number: ");
    int number = input.nextInt();
    int[] numbers = new int[number];
    
    System.out.print("Enter number: ");
    for(int count = 0; count < number; count++){
    numbers[count] = input.nextInt();
    }
    
    
        Arrays.sort(numbers);
    System.out.print("Accending order: ");
    for (int count = 1; count < number; count++){
        System.out.print(numbers[count] + " ");
    }
    
    }
    }
    
