public class ArrayFifteen{
public static void main(String[] args){

int[] numbers = {3,5,6,-9,0,9,-7,6,-7,7,9,-7};
int arr = getNegative(numbers);
System.out.print("Negative : " + arr);
}

            public static int getNegative(int [] numbers){
                    int array = 0;
                    for(int count = 0; count < numbers.length;count++){
                    
                    if(numbers[count] < 0){
                    array++;
                    }
             
                    }
                    
   
                    return array;
                    
}
}
