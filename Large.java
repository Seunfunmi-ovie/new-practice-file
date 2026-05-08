
import java.util.Scanner; 
public class Large {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter the number: ");
    int number = input.nextInt();
    int[] numbers = new int[number];
    System.out.print("Enter number: ");
    for(int count = 0; count < number; count++){
    numbers[count] = input.nextInt();
    }
    int largest = numbers[0];
    int smallest = numbers[0];
    for (int count = 1; count < number; count++){
    
    if(numbers[count] > largest) {
    largest = numbers[count]; 
    }
    
    if(numbers[count] < smallest) {
        smallest = numbers[count];
        }
        }
    System.out.print("The largest number is " + largest);
    System.out.print("The smallest number is" + smallest);
    
    }
    
    }
    
