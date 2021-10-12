import java.util.Scanner;
public class ATM{
public static void main(String args[] ){
	System.out.println("    --<MODHTOM ATM>--    "); System.out.println("Welcome to modhtom ATM");
   while(true)
   {try{
System.out.print("ENTER Account Number:");
		 Scanner  N= new Scanner(System.in);
       Scanner P = new Scanner(System.in);
		 long na = N.nextInt();
         int i=0;
          //admin
          if(na==1234567891){
            System.out.print("ENTER THE PASSWORD:");   
            long pass = P.nextInt();
            if(pass==1234567891){
      System.out.print("2004/2004=1039090 & 2003/2003=103 & 2011/2011=31");
            }else{ System.out.println("wrong password");}}

         //account1
         if(na==2004){        
         while(i<=2){
            System.out.print("ENTER THE PASSWORD:");
            
            long pass = P.nextInt();
         if(pass==2004){
 int balance = 1039090, withdraw, deposit;
   Scanner sc = new Scanner(System.in);
   while(true)
  {
       System.out.println(" ");
       System.out.println("What do you want to perform:");
       System.out.println(" 1 for Withdraw");
       System.out.println(" 2 for Deposit");
       System.out.println(" 3 for Check Balance");
       System.out.println(" 4 for EXIT");
       int choice = sc.nextInt();
       switch(choice)
       {
         case 1:
   System.out.print("Enter money to be withdrawn:");
   withdraw = sc.nextInt();
  if(balance >= withdraw)
   { balance = balance - withdraw; }
   else {
 System.out.println("Insufficient Balance"); }
   System.out.println("Your Balance is "+balance +"$" );
   break;
 case 2:
  System.out.print("Enter money to be deposited:");
   deposit = sc.nextInt();
   balance = balance + deposit;

   System.out.println("Your Balance is "+balance+"$");
   break;
case 3:
System.out.println("Your Balance is "+balance);
   break;
           case 4:
           System.out.println("BYE");
   System.exit(0);
       }}}if(i<=1){
        System.out.println("wrong password");}else{System.out.println("password entered wrong three times your card is now blocked,bye");}
    i++;}}

     //account2
     if(na==2003){
        while(i<=2){
           System.out.print("ENTER THE PASSWORD:");
           
           long pass = P.nextInt();
        if(pass==2003){
int balance = 103, withdraw, deposit;
  Scanner sc = new Scanner(System.in);
  while(true)
 {
      System.out.println(" ");
      System.out.println("What do you want to perform:");
      System.out.println(" 1 for Withdraw");
      System.out.println(" 2 for Deposit");
      System.out.println(" 3 for Check Balance");
      System.out.println(" 4 for EXIT");
      int choice = sc.nextInt();
      switch(choice)
      {
        case 1:
  System.out.print("Enter money to be withdrawn:");
  withdraw = sc.nextInt();
 if(balance >= withdraw)
  { balance = balance - withdraw; }
  else {
       System.out.println("Insufficient Balance"); }
  System.out.println("Your Balance is "+balance +"$" );
  break;
 case 2:
 System.out.print("Enter money to be deposited:");
  deposit = sc.nextInt();
  balance = balance + deposit;

  System.out.println("Your Balance is "+balance+"$");
  break;
case 3:
System.out.println("Your Balance is "+balance);
  break;
          case 4:
          System.out.println("BYE");
  System.exit(0);
      }}}if(i<=1){
       System.out.println("wrong password");}else{System.out.println("password entered wrong three times your card is now blocked,bye");}
   i++;} }

//account3
if(na==2011){
    while(i<=2){
       System.out.print("ENTER THE PASSWORD:");
       
       long pass = P.nextInt();
    if(pass==1234){
int balance = 31, withdraw, deposit;
Scanner sc = new Scanner(System.in);
while(true)
{
  System.out.println(" ");
  System.out.println("What do you want to perform:");
  System.out.println(" 1 for Withdraw");
  System.out.println(" 2 for Deposit");
  System.out.println(" 3 for Check Balance");
  System.out.println(" 4 for EXIT");
  int choice = sc.nextInt();
  switch(choice)
  {
    case 1:
System.out.print("Enter money to be withdrawn:");
withdraw = sc.nextInt();
if(balance >= withdraw)
{ balance = balance - withdraw; }
else {
   System.out.println("Insufficient Balance"); }
System.out.println("Your Balance is "+balance +"$" );
break;
case 2:
System.out.print("Enter money to be deposited:");
deposit = sc.nextInt();
balance = balance + deposit;

System.out.println("Your Balance is "+balance+"$");
break;
case 3:
System.out.println("Your Balance is "+balance);
break;
      case 4:
      System.out.println("BYE");
System.exit(0);
  }}}if(i<=1){
   System.out.println("wrong password");}else{System.out.println("password entered wrong three times your card is now blocked,bye");}
i++;} }}catch (Exception ex) { System.out.println("wrong input");}
}}}