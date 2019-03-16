import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    
    public Composite ( String s )
    {
        description = s ;
    }

    public void printDescription() {
        System.out.println( description );
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
    

    public void addChild(Component c) {
        components.add( c ) ;
    }
    
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
 
     
}
 
