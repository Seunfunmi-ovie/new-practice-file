import java.util.Scanner;
    public class Read{
    public static void main(String [] args) {
    
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the number input: ");
   int number = input.nextInt();
   int sum = 0;
   for(int count =1; count <= number; count++){
   System.out.print("Enter the number: ");
   int numbertwo = input.nextInt();
  
  sum += numbertwo;
  }
  System.out.print("The sum is " + sum);
  
  }
  
  }
