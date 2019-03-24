public class Cheese extends LeafDecorator
{
    private String[] options ;
    private String[] premiumOptions;
    
    
    public Cheese( String d )
    {
        super(d) ;
    }
    
    // 1 cheese free, extra cheese +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 1 )
            this.price += (options.length-1) * 1.00 ;
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }
        
        String desc2 = "   " ;
        for ( int i = 0; i<premiumOptions.length; i++ )
        {
            if (i>0) desc2 += " + " + premiumOptions[i] ;
            else desc2 = premiumOptions[i] ;
        }
        String descs = desc + "\n" +"    "+desc2;
        return descs;
    }
    
        // each premium cheese +1.50
    public void setPremiumCheessOptions( String[] premiumOptions )
    {
        this.premiumOptions = premiumOptions ;
        if ( premiumOptions.length >= 1 )
            this.price += (premiumOptions.length) * 1.50 ;
    }
    
}