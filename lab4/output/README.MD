1. CRC Cards

    Class Name: Customer

    Responsibilities:

          know: 
                name, cellphone number, party size

          do: 
                provide name, provide cellphone number, provide party size, request table, cancel request

    Collaborators: WaitlistManager
  



    Class Name: WaitlistManager

    Responsibilities:

          know: 
               customer party size, number of customer in waitlist, waitlist size 

          do: 
               register customer waitlist, notify customer table status, remove customer from waitlist

    Collaborators:  Waitlist, TableManager
    
    
    
    
    Class name: Waitlist

    Responsibility:

          know: 
              next customer in list  

          do: 
              get next customer phone number, update next customer in list  

    Collaborator: WaitlistManager

  
  

    Class Name: Table

    Responsibilities:

          know: 
               total number of table, table size, table status 

          do: 
               update table status 

    Collaborators: TableManager

 
 
   
    Class Name: TableManager

    Responsibilities:

          know: 
                table status, table size

          do: 
                get table status, get table size, notify WaitlistManager table status

    Collaborators: Table, WaitlistManager

          

               

