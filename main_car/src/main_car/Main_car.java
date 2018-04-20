
package main_car;
import java.util.Scanner;
public class Main_car {

  
    public static void main(String[] args) {
        System.out.println("====LOGIN======");
     String name;
     Scanner ac =new Scanner(System.in);
     System.out.print("Your name :");
     name= ac.nextLine();
    String Surname;
    Scanner ac1 =new Scanner(System.in);
     System.out.print("Your Surname:");
     Surname= ac.nextLine();
     int Number;
     Scanner ac2 =new Scanner(System.in);
     System.out.print("Your NumberPhone (Thailand):");
     Number= ac.nextInt();
     String Email;
     Scanner ac3 =new Scanner(System.in);
     System.out.print("Email:");
     Email= ac3.nextLine();
     
    
        int loop = 1;
        do{
          
        Scanner input = new Scanner(System.in);
         System.out.println("====Choose======");
     System.out.println("######Select a car rental item.#######");
     System.out.println("Choose 1. rent a car");
     System.out.println("Choose 2.return the car");
     System.out.println("***************************************");
     int Choose;
     Scanner ac4 =new Scanner(System.in);
     System.out.print("Choose:");
     Choose= ac4.nextInt();
     
  
        System.out.println("=========================================================");
        System.out.println("You went play again:");
        System.out.println("[1]Yes [2]No");
        loop = input.nextInt();
      }while (loop == 1) ; 
                          }
 
    }
     
    
    

