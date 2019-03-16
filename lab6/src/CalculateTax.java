import java.util.ArrayList;
import java.text.DecimalFormat;
public class CalculateTax {
    public Double taxRate = 0.09;
    public Double subtotal;
    public Double tax;
    public Double total;
    DecimalFormat df = new DecimalFormat("###.##");
    
    public CalculateTax(){
        tax = 0.00;
        subtotal = 0.00;
        total = 0.00;
    }
    
    public Double getSubtotal(ArrayList<Leaf> leaves) {
        for (int i = 0; i < leaves.size(); i++){
            subtotal+=leaves.get(i).getPrice();
        }
        String s= String.format("%-25s", "Subtotal:");
        System.out.println(s + "$"+ df.format(subtotal));
        return subtotal;
    }
    
    public Double calcTax(){
        tax = subtotal * taxRate;
        String t = String.format("%-25s", "Tax:");
        System.out.println(t + "$"+ df.format(tax));
        return tax;
    }
    
    public void printTotal(){
        total = subtotal + tax;
        String tt = String.format("%-25s", "Total:");
        System.out.println(tt + "$"+ df.format(total));
    }
        
}
