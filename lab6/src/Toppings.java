
public class Toppings extends Leaf{
    private String[] options ;
    
    
    public Toppings( String s, String[] o )
    {
        super(s,o);
    }

    public void getDescription() 
    {
        for ( int i = 0; i < options.length; i++ )
        {
            System.out.println("    "+options[i]);
        }        
    }
    
    public void getPackingSlipDescription() {
        for ( int i = 0; i<options.length; i++ ){
             if (options[i].charAt(0) != '{' && options[i].charAt(0) != '-' ){
                System.out.println("    "+options[i]);
             } 
        }
        
        for ( int i = 0; i<options.length; i++ ){
             if (options[i].charAt(0) == '-'){
                System.out.println("    "+options[i]);
             } 
        }
        
        for ( int i = 0; i<options.length; i++ ){
             if (options[i].charAt(0) == '{'){
                System.out.println("    "+options[i]);
             } 
        }
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;

    }

}
