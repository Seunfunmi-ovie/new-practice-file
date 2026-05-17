public class ArrayEleven{
public static void main(String[] seunfunmi){
int [] numbers = {2,4,5,6,7,3,2,5,3,6};

int add = getProduct(numbers);
System.out.print("The sum is: " + add);



}

    public static int getProduct(int [] numbers){
    
        int sum = 0;
      for(int count = 0; count < numbers.length; count += 2){
      
        sum += numbers[count];
      }
      
  return sum;
    
    }
}
