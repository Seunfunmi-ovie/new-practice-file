import java.util.Scanner;
public class ArraySix{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter number of input: ");
int number = input.nextInt();
int[] numbers = new int [number];
int large = getLargest(numbers, input);
System.out.print("Largest: " + large);

}
        public static int getLargest(int [] numbers, Scanner input){
            int largest = numbers[0];
            for(int count = 0; count < numbers.length; count++){
            System.out.print("Enter number: ");
            numbers[count] = input.nextInt();
            if(numbers[count] > largest){
            largest = numbers[count];
            }
            }        
return largest;
        }
}
