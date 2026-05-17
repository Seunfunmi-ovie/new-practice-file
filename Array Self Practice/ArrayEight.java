import java.util.Scanner;
public class ArrayEight {
public static void main (String[] seunfunmi){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of input: ");
    int number = input.nextInt();
    int[] numbers = new int [number];
 int small = getSmallest(numbers, input);
 System.out.print("Smallest: " + small);   

}

        public static int getSmallest(int [] numbers, Scanner input){
        int smallest = numbers[0];
        for(int count = 0; count < numbers.length; count++){
        System.out.print("Enter number: ");
        numbers[count] = input.nextInt();
        if(numbers[count] < smallest){
        smallest = numbers[count];
        }
        }
        
    return smallest;    
        }
}
