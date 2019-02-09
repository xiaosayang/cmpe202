
/**
 * Write a description of class GumballMachine2 here.
 * CHild class of GumballMachine
 * @Xiaosa Yang (your name)
 * 
 */
public class GumballMachine2 extends GumballMachine
{

    /**
     * Constructor for objects of class GumballMachine2
     */
    public GumballMachine2(int numberOfGumballs)
    {
        // call parent class constructor
        super(numberOfGumballs);
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
