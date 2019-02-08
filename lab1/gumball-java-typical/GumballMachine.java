import java.io.*;
import java.util.*;
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
    
    public void caseDescription()
    {
        System.out.println( "Please chose from following Gumball Machines Models to play:\nModel1: Cost 25 cents, accepts only quarters.\nModel2: Cost 50 cents, accepts two quarters.\nModel3: Cost 50 cents, accepts all USA coins.\n");
        System.out.println( "Enter 1 for Model1, enter 2 for Model2, enter 3 for Model 3\nEnter anything else to exit the program.\n");
        System.out.println( "Please enter your choice: ");
        Scanner input = new Scanner(System.in);
        
        while (input.hasNextInt())
        {
            int choice = input.nextInt();
            // If user chose to play Model1
            if (choice == 1)
                {
                    System.out.println( "You have entered "+ choice);
                    System.out.println( "Please enter 25 to insert quarter:");
                    Scanner quarter = new Scanner(System.in);
                    if (quarter.hasNextInt()){
                        int q = quarter.nextInt();
                        insertQuarter(q);
                        turnCrank();
                    }
                    System.out.println( "Please enter your choice: ");
                }
           else if (choice == 2)
                {
                    System.out.println( "You have entered "+ choice);
                    System.out.println( "Please enter your choice: ");
                }
           else if (choice == 3)
                {
                    System.out.println( "You have entered "+ choice);
                    System.out.println( "Please enter your choice: ");
                }
           else {
                    break;
                }
        }
        System.out.println( " You have exited the program.");
    } 
    
    public Dictionary createCoinDict()
    {
        Dictionary coins = new Hashtable();
	coins.put(1,"Penny");
	coins.put(5,"Nickel");
	coins.put(10, "Dime");
	coins.put(25, "Quarter");
	return coins;
    }
}
