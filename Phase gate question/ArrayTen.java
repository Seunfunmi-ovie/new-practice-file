public class ArrayTen{
public static void main(String [] seunfunmi){

int [] numbers = {3,7,8,9,4,6,7};
int multiply = getProduct(numbers);
System.out.print("Product: " + multiply);

}

        public static int getProduct(int [] numbers){
        int product = 1;
        for(int count = 0; count < numbers.length; count++){
            product *= numbers[count];
        }
        
        return product;
        }
}

