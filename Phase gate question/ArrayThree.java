public class ArrayThree {
public static void main(String[] args){

    double[] numbers = {4,8,9,7,4,6,6,7,8};
    System.out.print(averageArray(numbers));
    
}

    public static double averageArray(double [] numbers){
    double sum = 0;
   for(int count = 0; count < numbers.length; count++){
   
        sum += numbers[count];        

   } 
    double average = sum/numbers.length;
    return average;
    }

}
