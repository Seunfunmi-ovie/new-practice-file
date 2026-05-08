import java.util.Scanner;
public class Reversed {
    public static void main(String[] args){
    
    Scanner input =new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = input.nextInt();
    for(int count = number; count >= 1; count--){
    
    System.out.print(count + " ");
    }
    }
    }
