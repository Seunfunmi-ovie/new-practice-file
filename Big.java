import java.util.Scanner;
public class Big {
    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int number = input.nextInt();
    int sumEven = 0;
    int sumOdd = 0;
    for(int count = 1; count <= number; count++) {
    
    System.out.print("Enter the number: ");
        int numbertwo = input.nextInt();
        
        if (numbertwo % 2 == 0){
        sumEven += numbertwo;
        }
        else {
        sumOdd += numbertwo;
        }
        }
         System.out.println("The sum of even is " + sumEven );
        
        System.out.println("The sum of odd is " + sumOdd );
       
       
        
        
      
        
        }}
        
