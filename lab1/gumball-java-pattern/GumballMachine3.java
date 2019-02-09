import java.io.*;
import java.util.*;
/**
 * Write a description of class GumballMachine3 here.
 * This class is another child class of GumballMachine
 * @Xiaosa Yang (your name)
 * @version (a version number or a date)
 */
public class GumballMachine3 extends GumballMachine
{

    /**
     * Constructor for objects of class GumballMachine3
     */
    public GumballMachine3(int num)
    {
        // call parent class constructor
        super(num);
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #3");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is waiting for coins\n");
        return result.toString();
    }

}
