import java.io.*;
import java.util.*;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    Scanner quarter;
    boolean has_quarter;
    int cost;
    Scanner validCoin;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.cost = 50;
        this.has_quarter = false;
        this.gumballMachine = gumballMachine;
    }
    
    /* Not using this method
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    */
   
    // New insertQuarter()
    public void insertQuarter(String s)
    {
        System.out.println(s);
        this.quarter = new Scanner(System.in);
        while (!this.quarter.hasNextInt()){
           System.out.println(s);
           this.quarter = new Scanner(System.in);
        }
        int q = this.quarter.nextInt();   
        checkQuarter(q);
        while(!this.has_quarter)
        {
            System.out.println(s);
            this.quarter = new Scanner(System.in);
            if (this.quarter.hasNextInt())
            {
                q = this.quarter.nextInt();
                checkQuarter(q);   
            }
        }
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    
    public void insertCoins(String s)
    {
        Map< Integer, String> coins = createCoinDict();
        this.cost = 50;
        while(this.cost > 0)
        {
            System.out.println(s);
            this.validCoin = new Scanner(System.in);
            while (!this.validCoin.hasNextInt()){
               System.out.println(s);
               this.validCoin = new Scanner(System.in);
            }
            int coin = this.validCoin.nextInt();
            // check if user input exist in map
            while(!coins.containsKey(coin)|| this.cost - coin < 0)
            {
                System.out.println(s);
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
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    
    // helper method to insertQuarter function
    public void checkQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else
        {
            this.has_quarter = false ;
            ejectQuarter();
        }
    }
    
    // helper method to insertCoins function
    public Map createCoinDict()
    {
        Map < Integer, String> coins = new Hashtable();
        coins.put(1,"Penny");
        coins.put(5,"Nickel");
        coins.put(10, "Dime");
        coins.put(25, "Quarter");
        return coins;
    }
    
    void setCost(int cost) {
        this.cost = cost;
    }
    
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
    
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
    
    public void dispense() {
        System.out.println("You need to pay first");
    } 
    
    public String toString() {
        return "waiting for quarter";
    }
}
