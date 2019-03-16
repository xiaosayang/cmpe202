
public class Fries extends Leaf{
    private String[] options ;
    
    
    public Fries( String s, Double p ) {
        super(s,p);
    }

    public void getDescription() {
        String desc = "\n" ;
        for ( int i = 0; i<options.length; i++ )
        {
            System.out.println(options[i]);
        }       
    }
}
