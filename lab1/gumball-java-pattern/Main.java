import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        GumballMachine2 gumballMachine2 = new GumballMachine2(5);
        GumballMachine3 gumballMachine3 = new GumballMachine3(5);
        
        String str1 ="\nPlease chose from following Gumball Machines Models to play:\nModel #1: Cost 25 cents, accepts only quarters.\nModel #2: Cost 50 cents, accepts two quarters.\nModel #3: Cost 50 cents, accepts all USA coins.\n";
        String str2 ="Enter 1 for Model #1, enter 2 for Model #2, enter 3 for Model #3\nEnter anything else to exit the program.\n";
        String str3 ="Please enter your choice: ";
        String s1 = "Please enter 25 to insert Quarter:";
        String s2 = "Please enter 25 to insert the first Quarter:";
        String s3 = "Please enter 25 to insert the second Quarter:";
        String s4 = "Please enter a valid number for US coins (1 for Penny, 5 for Nickle, 10 for Dime and 25 for Quarter):";
        Scanner input = new Scanner(System.in);
       
        do {
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            //Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            // If user chose to play Model1
            if (choice == 1)
                {
                    System.out.println(gumballMachine); 
        
                    gumballMachine.insertQuarter(s1);
                    gumballMachine.turnCrank();
                    System.out.println(str1);
                    System.out.println(str2);
                    System.out.println(str3);
                }
           else if (choice == 2)
                {
                    System.out.println(gumballMachine2); 
        
                    gumballMachine2.insertQuarter(s2);
                    gumballMachine2.setState(gumballMachine2.getNoQuarterState());
                    gumballMachine2.insertQuarter(s3);
                    gumballMachine2.turnCrank();
                    System.out.println(str1);
                    System.out.println(str2);
                    System.out.println(str3);
                }
           else if (choice == 3)
                {
                    System.out.println(gumballMachine3);
                    
                    gumballMachine3.insertCoins(s4);
                    gumballMachine3.setState(gumballMachine3.getHasQuarterState());
                    gumballMachine3.turnCrank();
                    System.out.println(str1);
                    System.out.println(str2);
                    System.out.println(str3);
                   
                }
           else {
                    break;
                }
        } while (input.hasNextInt());
        System.out.println( " You have exited the program.");
        
        /* Original source code
        GumballMachine gumballMachine = new GumballMachine(5);
    
        System.out.println(gumballMachine);
        
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    
        //System.out.println(gumballMachine);
        
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    
        System.out.println(gumballMachine);
        */
    }
}
