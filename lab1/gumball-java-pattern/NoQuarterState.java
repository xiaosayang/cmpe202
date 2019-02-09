import java.io.*;
import java.util.*;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    String s1;
    Scanner quarter;
    boolean has_quarter;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.has_quarter = false;
        this.s1 = "Please enter 25 to insert Quarter:";
        this.gumballMachine = gumballMachine;
    }
    /*
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    */
   
    public void insertQuarter()
    {
        System.out.println(this.s1);
        this.quarter = new Scanner(System.in);
        while (!this.quarter.hasNextInt()){
           System.out.println(this.s1);
           this.quarter = new Scanner(System.in);
        }
        int q = this.quarter.nextInt();   
        checkQuarter(q);
        while(!this.has_quarter)
        {
            System.out.println(this.s1);
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
