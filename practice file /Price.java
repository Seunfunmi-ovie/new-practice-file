import java.util.Scanner;
public class Price {

    public static void main(String[] seunfunmi){
   Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int number = input.nextInt();
     input.nextLine(); 
    String answer = " ";
    int total = 0;
    while(true){
    System.out.println("Enter product name: ");
    String products = input.nextLine();
//        input.next();
   
          System.out.println("Enter price: ");
          int price = input.nextInt();
    input.nextLine();
    
    total += price;
    System.out.print("Do you want to continue: ");
     answer = input.nextLine();
    if(answer.equals ("Yes")){
    System.out.println("continue");
   
    
    }
    else{
    System.out. println("Stop");

    
    break;
    }
    }
  int  average = total/number;
    System.out.println("Total: " + total);
        System.out.println("Average: " + average);
   
   
    }
    }


