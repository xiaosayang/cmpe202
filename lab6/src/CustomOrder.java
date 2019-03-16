
public class CustomOrder extends Composite {
    
    public CustomOrder ( String s )
    {
        super(s) ;
    }
    
    public void printDescription() {
        System.out.println(description );
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
    
    public void printPackingSlip(){
        System.out.println( description );
        for (Component obj  : components)
        {
            obj.printPackingSlip();
        }
    }
}
