import java.util.Scanner;
public class Name {
    public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
    
   System.out.print("Enter a number: ");
    int largest= input.nextInt();
    
    for(int count = 1; count <= 10; count++) {
    
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    if(number > largest) {
    
    largest = number;
   }
   
   } 
    System.out.println("The largest number is : " + largest);
    
    
    
   }
    }
    
    
