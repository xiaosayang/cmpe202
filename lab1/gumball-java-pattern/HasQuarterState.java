

import java.util.*;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertQuarter(String s) {
        System.out.println("You can not insert another quarter.");
    }
    
    public void insertCoins(String s) {
        System.out.println("You can not insert another coin.");
    }
    
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
    public void turnCrank() {
        Scanner turn = new Scanner( System.in);
        int num;
        do {
            System.out.println("Please enter 0 to turn the crank:");
            while (!turn.hasNextInt()){
                System.out.println("Please enter 0 to turn the crank:");
                turn.next();
            }
            num = turn.nextInt();
        } while ( num != 0);
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }
    
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
     
    public String toString() {
        return "waiting for turn of crank";
    }
}
