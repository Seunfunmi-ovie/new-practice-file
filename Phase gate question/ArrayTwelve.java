public class ArrayTwelve{
public static void main(String [] seunfunmi){

int [] numbers = {4,7,5,7,8,5,7,8,6,8};
int odd = getOddIndex(numbers);
System.out.print("Odd Index is: " + odd);


}
        public static int getOddIndex(int[] numbers){
        int sum = 0;
        for(int count = 0; count < numbers.length; count++){
            if(count % 2 == 1){
            sum += numbers[count];
            }
       
        }
        return sum;
        }

}

