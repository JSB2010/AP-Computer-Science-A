package Week12;

//Bank account class
public class BankAccount
 {

     private String name;
     private double balance;
   
   //Default constructor method
   public BankAccount()
   {
     //initiation of variables
       name = "Unknown";
       balance = 0.0;

   }
   //constructor that takes 2 parameters for name and balance 
    public BankAccount(String nm, double initBal)
   {
     //initiation of variables
       name = nm;
       balance = initBal;

   }
    
   //Accessors 
   //get the Account owner's name
   public String getName()
   {
       return name;
 
   }
   
   //get the balance 
   public double getBalance()
   {
       return balance;
   
   }
   
   //Mutators
   // method to make a deposit
   public void deposit(double deposit)
   {
     //A deposit affects the balance
       balance += deposit;
   
   }
   
   //method to make a withdrawal
   
   public void withdrawal(double withdrawal)
   {
     //A withdrawal affects the balance
       balance -= withdrawal;
   }
   
   //toString method  
   public String toString()
   {
       String theString = "Account owner: " + name + "\nBalance: " + balance;
       return theString;
     
   }                         
   
  
   
 }