import java.util.Scanner;
public class PriceOne {

    public static void main(String[] seunfunmi){
   Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int number = input.nextInt();
     input.nextLine(); 
String answer = " ";
    do {
    System.out.println("Enter product name: ");
    String products = input.nextLine();
//        input.next();
   
          System.out.println("Enter price: ");
          int price = input.nextInt();
    input.nextLine();
    System.out.print("Do you want to continue: ");
    answer = input.nextLine();
    }while(answer.equals("Yes"));
  //  System.out.println(");
    
    }
   
    
    }
    
    
    
    
    


