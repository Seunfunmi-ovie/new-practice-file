import java.util.Scanner;
public class ArrayThirteen{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the input number: ");
 int number = input.nextInt();
 
int [] numbers = new int [number];
int[] arr = getArray(numbers,input);
 for(int count = 0; count < arr.length; count++){
 
 System.out.print(arr[count] + " ");
}
}
            public static int[] getArray(int [] numbers,Scanner input){
            int[] array = new int [numbers.length];
            for(int count = 0; count < numbers.length; count++){
            System.out.print("Enter number: ");
            array[count] = input.nextInt();
            
    }
    
    return array;
            }
}


