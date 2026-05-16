public class ArrayNine{

public static void main(String[] seunfunmi){
int [] numbers = {3,5,7,8,8,9,0,1,3};
int [] back = getReversed(numbers);
System.out.print("Reversed: ");
for(int count = 0; count < back.length; count++){
System.out.print(back[count] + " ");
}
}
        
        public static int[] getReversed(int [] numbers){
        int [] reversed = new int[numbers.length];
        for(int count = 0;count < numbers.length; count++){
        reversed[count] = numbers[numbers.length - 1 - count];

}
return reversed;

        }
        
}
