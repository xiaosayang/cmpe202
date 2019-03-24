  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order\n\n" ) ;
        
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // Organic Bison* price for 1/2 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        // each premium cheese +1.50
        String[] co1 = { "Danish Blue Cheese" } ;
        c.setPremiumCheessOptions( co1 ) ;
        c.wrapDecorator( b ) ;
        
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( c );
        //customBurger.setDecorator( s ) ;
        
        // unlimited toppings free
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        // premium toppings $1.00-$3.00 per selection
        Premium p = new Premium( "Premium Toppings" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        // Bun, some bun may cost extra
        Bun bb = new Bun("Bun Options");
        String[] bbo = {"Ciabatta(Vegan)"};
        bb.setOptions(bbo);
        bb.wrapDecorator(p);
        
        //Side, each side is at $3.00
        Side ss = new Side("Side Options");
        String[] sso = {"Shoestring Fries"};
        ss.setOptions(sso);
        ss.wrapDecorator(bb);
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( ss ) ;
        customBurger1.addChild( b ) ;
        customBurger1.addChild( c ) ;
        customBurger1.addChild( s ) ;
        customBurger1.addChild( t ) ;
        customBurger1.addChild( p ) ;
        customBurger1.addChild( bb );
        customBurger1.addChild( ss );
        
        // Add Custom Burger number 1 to the Order
        order.addChild( customBurger1 );
        
        // create custom burger number 2
        CustomBurger customBurger2 = new CustomBurger( "\n\nBuild Your Own Burger" ) ;
        // Hormone & Antibiotic Free Beef* for 1/3 lb
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo1 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b1.setOptions( bo1 ) ;
        
        // 1 cheese free, extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co11 = { "Smoked Gouda", "Creek Feta" } ;
        c1.setOptions( co11 ) ;
        // each premium cheese +1.50
        String[] co2 = { "Fresh Mozzarella" } ;
        c1.setPremiumCheessOptions( co2 ) ;
        c1.wrapDecorator( b1 ) ;
        
        // 1 sauce free, extra +.50
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so1 = { "Habanero Salsa" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( c1 );
        
        
        // unlimited toppings free
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to1 = { "Crushed Peanuts" } ;
        t1.setOptions( to1 ) ;
        t1.wrapDecorator( s1 ) ;
        
        // premium toppings $1.00-$3.00 per selection
        Premium p1 = new Premium( "Premium Toppings" ) ;
        String[] po1 = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;
        p1.setOptions( po1 ) ;
        p1.wrapDecorator( t1 ) ;
        
        // Bun, some bun may cost extra
        Bun bb1 = new Bun("Bun Options");
        String[] bbo1 = {"Gluten-Free Bun"};
        bb1.setOptions(bbo1);
        bb1.wrapDecorator(p1);
        
        //Side, each side is at $3.00
        Side ss1 = new Side("Side Options");
        String[] sso1 = {"Shoestring Fries"};
        ss1.setOptions(sso1);
        ss1.wrapDecorator(bb1);
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( ss1 ) ;
        customBurger2.addChild( b1 ) ;
        customBurger2.addChild( c1 ) ;
        customBurger2.addChild( s1 ) ;
        customBurger2.addChild( t1 ) ;
        customBurger2.addChild( p1 ) ;
        customBurger2.addChild( bb1 );
        customBurger2.addChild( ss1 );
        
        // Add Custom Burger number 2 to the ORder
        order.addChild( customBurger2 );
        
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/