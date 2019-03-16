
public class Leaf implements Component{
    private String description;
    private Double price;
    private String[] options ;
        public Leaf(String s) {
        description = s;
    }
    
    public Leaf(String s, String[] o) {
        description = s;
        options = o;
    }
    public Leaf(String s, Double p) {
        description = s;
        price = p;
    }
    public void printDescription() {
        if (price != null){
            String f= String.format("%-25s", description);
            System.out.println(f+"$"+price);
        }
        //else{ System.out.println(description);}
        if (options != null){
            getDescription();
        }
    }
    
    public void printPackingSlip() {
        if (price != null){
            String f= String.format("%-25s", description);
            System.out.println(f);
        }
        //else{ System.out.println(description);}
        if (options != null){
            getPackingSlipDescription();
        }
    }
    
    public void getDescription() {
        for ( int i = 0; i<options.length; i++ )
        {
            System.out.println(options[i]);
        }       
    }
    
    public void getPackingSlipDescription() {
        //System.out.println(description);
    }
    
        public void setOptions( String[] options )
    {
        this.options = options ;

    }
    
    
    public void addChild(Component c) {
        
    }
    
    public void removeChild(Component C) {
        
    }
    
    public Component getChild(int i) {
        return null;
    }
    
    public Double getPrice() {
        return this.price;
    }
    
}
