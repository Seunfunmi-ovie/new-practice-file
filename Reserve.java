public class ReverseNumber {
public static int reversed(int number) {
int reversed = 0;
    while(number != 0) {
    int digit = number % 10;
     reversed = reversed * 10 + digit;
     reversed = number/10;
    
    }
   return reversed;
   }
   
   }
