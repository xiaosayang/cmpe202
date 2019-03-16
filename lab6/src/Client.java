import java.util.ArrayList;
public class Client {
    public static void main(String[] args) {

        ArrayList<Leaf> leaves = new ArrayList<Leaf>();
        Composite currentOrder = new Composite ("   FIVE GUYS");
        CustomOrder customburger = new CustomOrder("Order Number: 1");
        
        Leaf burger = new Burgers("LBB", 5.59);
        leaves.add(burger);
        
        String[] t = {"{{{{ BACON }}}}","LETTUCE","TOMATO","->|G ONION","->|JALA Grilled" };
        Leaf topping = new Toppings("Toppings", t);
        topping.setOptions(t);

        Leaf fries = new Fries("LTL CAJ", 2.79);
        leaves.add(fries);
        
        customburger.addChild(burger);
        customburger.addChild(topping);
        customburger.addChild(fries);
        currentOrder.addChild(customburger);
        
        currentOrder.printDescription();
        CalculateTax c = new CalculateTax();
        c.getSubtotal(leaves);
        c.calcTax();
        c.printTotal();
        
        System.out.println();
        System.out.println();

        currentOrder.printPackingSlip();
        
    }
}

