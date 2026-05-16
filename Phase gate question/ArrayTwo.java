import java.util.Scanner;
public class ArrayTwo {
public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int numbers[] = new int[number];
        int totalSum = sumArray(numbers,input);
        System.out.print("Sum"+ totalSum);
}

            public static int sumArray(int [] numbers, Scanner input){
            
                int sum = 0;
                for(int count = 0; count < numbers.length; count++){
                
                System.out.print("Enter number: ");
                numbers[count] = input.nextInt();
                sum += numbers[count];
                
                }
return sum;
            }
}
