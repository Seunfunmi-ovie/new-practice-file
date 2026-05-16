public class ArrayFive{
public static void main(String [] args){

int [] numbers = {3,6,7,9,100,678,56,34};
int large = largeArray(numbers);
System.out.println("The largest number is : " + large);
}



            public static int largeArray(int [] numbers){
            
            int largest = numbers[0];
            for(int count = 0; count < numbers.length; count++){
                if(numbers[count] > largest){
                    largest = numbers[count];
                
                }
            
            }
            
  return largest;          
            
            }
}
