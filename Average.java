import java.util.Scanner;
public class Average { 
 public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = input.nextInt();
    
    int sum = 0;
    for(int count = 1; count <= number; count++){
    
   System.out.print("Enter number: ");
   int numbertwo = input.nextInt();
   
   sum +=numbertwo;
   }
   
   int average = sum/number;
   System.out.print("The Sum is " + sum);
   System.out.print("The average is " + average);
   
   }
   
   }
