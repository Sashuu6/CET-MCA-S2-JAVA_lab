import java.util.Scanner;
public class bank
{
 public static void main(String args[])
 {
  int ch,ch1;
  Scanner sc=new Scanner(System.in);
  bank_account accou=new bank_account();
  System.out.println("Enter balance: ");
  accou.balance=sc.nextFloat();
  System.out.println("-----------------------------------");
  System.out.println("-----------------------------------");
  System.out.println("------------CARD SWIPPED-----------");
  System.out.println("-----------------------------------");
  System.out.println("-----------------------------------");
  do
  {
   System.out.println("Current balance: "+accou.balance);
   System.out.println("1. Current Account");
   System.out.println("2. Savings Account");
   System.out.println("Enter your choice: ");
   ch=sc.nextInt();
   switch(ch)
   {
    case 1: accou.current();
            break;
    case 2: accou.savings();
            break;
   }
   System.out.println("Do you wish to continue?? yes=1 && no=0 : ");
   ch1=sc.nextInt();
  }
  while(ch1==1);
  {
   System.out.println("Thank you for using our software.  ");
  }
 }
}
