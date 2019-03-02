1. CRC Cards

    Class name: Customer

    Responsibility:

          know: 
                name, cellphone number, party size

          do: 
                provide name, provide cellphone number, provide party size, request table, cancel request

    Collaborator: WaitlistManager
  

    Class name: WaitlistManager

    Responsibility:

          know: 
               customer party size, number of customer in waitlist, waitlist size 

          do: 
               register customer waitlist, notify customer table status, remove customer from waitlist

    Collaborator:  Waitlist, TableManager     

    Class name: Waitlist

    Responsibility:

          know: 
              next customer in list  

          do: 
              get next customer phone number, update next customer in list  

    Collaborator: WaitlistManager

          

    Class name: Table

    Responsibility:

          know: 
               total number of table, table size, table status 

          do: 
               update table status 

    Collaborator: TableManager

          
   
    Class name: TableManager

    Responsibility:

          know: 
                table status, table size

          do: 
                get table status, get table size, notify WaitlistManager table status

    Collaborator: Table, WaitlistManager

          

               
