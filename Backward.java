import java.util.Scanner;
public class Backward {
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = input.nextInt();
    for(int count = 1; count <= number; count++){
    int remainder = number % 10;
    int divided = number / 10;
        System.out.print(remainder + " ");
        number = divided;
    
    
    
    }




}



}
