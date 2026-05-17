public class ArrayFourteen{
public static void main(String [] seunfunmi){
int [] numbers = {3,6,7,6,6,-3,7,0,-5};
int arr = getPositive(numbers);



System.out.print("Positive: " + arr); 
}



            public static int getPositive(int [] numbers){
            
              int array = 0;
              
                    for(int count = 0; count < numbers.length; count++){
                    if(numbers[count] > 0){
                    array++;
                    }
                    }
            return array;
            
            }
}
