import java.io.*;
import java.util.*;
public class GumballMachine
{

    private int num_gumballs,cost;
    private boolean has_quarter;
    private Scanner quarter;
    private Scanner validCoin;
    public String s1, s2, s3, s4;
    

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.cost = 50;
        this.has_quarter = false;
        this.s1 = "Please enter 25 to insert Quarter:";
        this.s2 = "Please enter 25 to insert the first Quarter:";
        this.s3 = "Please enter 25 to insert the second Quarter:";
        this.s4 = "Please enter a valid number for US coins (1 for Penny, 5 for Nickle, 10 for Dime and 25 for Quarter):";
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
                System.out.println( "Thanks for your Quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your Quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a Quarter." ) ;
        }        
    }
    
    public void turnModel3Crank()
    {
        if ( this.num_gumballs > 0 )
        {
            this.num_gumballs-- ;
            System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
        }
        else
        {
            System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
        }
    }

    
    public void modelOne(String s)
    {
        System.out.println(s);
        this.quarter = new Scanner(System.in);
        while (!this.quarter.hasNextInt()){
           System.out.println(s);
           this.quarter = new Scanner(System.in);
        }
        int q = this.quarter.nextInt();   
        insertQuarter(q);
        while(!this.has_quarter)
        {
            System.out.println(s);
            this.quarter = new Scanner(System.in);
            if (this.quarter.hasNextInt())
            {
                q = this.quarter.nextInt();
                insertQuarter(q);   
            }
        }
    }
    
    public void modelTwo()
    {
        modelOne(this.s2);
        modelOne(this.s3);
    }
    
    
    public void modelThree()
    {
        Map< Integer, String> coins = createCoinDict();
        while(this.cost > 0)
        {
            System.out.println(this.s4);
            this.validCoin = new Scanner(System.in);
            while (!this.validCoin.hasNextInt()){
               System.out.println(this.s4);
               this.validCoin = new Scanner(System.in);
            }
            int coin = this.validCoin.nextInt();
            // check if user input exist in map
            while(!coins.containsKey(coin))
            {
                System.out.println(this.s4);
                this.validCoin = new Scanner(System.in);
                if(this.validCoin.hasNextInt())
                {
                    coin = this.validCoin.nextInt();
                }
            }
            this.cost -= coin;
            if (this.cost > 0)
            {
                System.out.println("You still have to insert " + this.cost + " cents.");
            }
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
                    // call helper method modelOne
                    modelOne(this.s1);
                    turnCrank();
                    System.out.println( "Please enter your choice: ");
                }
           else if (choice == 2)
                {
                    modelTwo();
                    turnCrank();
                    System.out.println( "Please enter your choice: ");
                }
           else if (choice == 3)
                {
                    //call helper method modelThree
                    modelThree();
                    turnModel3Crank();
                    System.out.println( "Please enter your choice: ");
                    this.cost = 50;
                }
           else {
                    break;
                }
        }
        System.out.println( " You have exited the program.");
    } 
    
    public Map createCoinDict()
    {
        Map < Integer, String> coins = new Hashtable();
        coins.put(1,"Penny");
        coins.put(5,"Nickel");
        coins.put(10, "Dime");
        coins.put(25, "Quarter");
        return coins;
    }
}
