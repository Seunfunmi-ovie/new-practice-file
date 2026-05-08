import java.util.Scanner;
public class Maximum {
 public static void main(String [] args) {
 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number: ");
            int number = input.nextInt();
      int largest = 0;
      for(int count = 1; count <= number; count++){
      System.out.print("Enter number: ");
      int numbertwo = input.nextInt();
      if (numbertwo > largest){
        largest = numbertwo;
      }
            }
      
  System.out.println("THe largest number is  " + largest);
  }
  
} 
