import java.io.*;
import java.util.*;

public interface State {
    
    public void insertQuarter(String s);
    public void insertCoins(String s);
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
