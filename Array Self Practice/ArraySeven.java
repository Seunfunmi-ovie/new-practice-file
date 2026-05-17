public class ArraySeven{
public static void main(String[] args){

int [] numbers = {2,69,1,67,34,6};
int small = getSmallest(numbers);
System.out.print("Smallest: " + small);
}
            public static int getSmallest(int[] numbers){
                int smallest = numbers[0];
                for(int count = 0; count < numbers.length; count++){
                        if(numbers[count] < smallest){
                            smallest = numbers[count];
                        }
                }

return smallest;

}
}
