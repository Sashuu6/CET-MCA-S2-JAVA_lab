import java.util.Scanner;
public class bank_account
{
 int choice,status,min_bal=500;
 public float balance;
 Scanner sc=new Scanner(System.in);
 void savings()
 {
  System.out.println("1. Compound Interest");
  System.out.println("2. Withdraw");
  System.out.print("Enter your choice: ");
  choice=sc.nextInt();
  switch(choice)
  {
   case 1: cmp_int();
           break;
   case 2: withdraw();
           break;
  }
 }
 void current()
 {
  System.out.println("1. Cheaque  book facility");
  System.out.println("2. Withdraw");
  choice=sc.nextInt();
  switch(choice)
  {
   case 1: check_book();
           break;
   case 2: withdraw();
           break;
  }
 }
 void cmp_int()
 {
  int p,t,n;
  double r=0.05;
  double amt;
  System.out.println("Compound Interest");
  System.out.println("Enter Principle: ");
  p=sc.nextInt();
  System.out.println("Enter number of years: ");
  t=sc.nextInt();
  System.out.println("Enter number of times interest in compounded per year: ");
  n=sc.nextInt();
  System.out.println("Principle: "+p);
  System.out.println("Number of years: "+t);
  System.out.println("number of times interest in compounded per year: "+n);
  System.out.println("Interest rate: "+5+"%");
  amt=(double)(p*(Math.pow((1+(r/n)),n*t)));
  System.out.println("Compound interest : "+amt);
  System.out.print("Would you like to add the principle amount as loan in current account? yes=1 && no=0 : ");
  status=sc.nextInt();
  if(status==1)
  {
   System.out.println("Loan has been issued.");
   balance=(float)(balance+amt);
   System.out.println("Current Balance: "+balance);
  }
  else
  {
   System.out.println("Thank you for using our service.");
  }
 }
 void check_book()
 {
  System.out.println("Cheaque  book falicity");
  System.out.print("Would you like to issue a new cheaque book? yes=1 && no 0 : ");
  status=sc.nextInt();
  if(status==1)
  {
   System.out.println("New cheaque book has been issued. The cheaque book will reach at registered address with 5 working days.");
  }
  else
  {
   System.out.println("Thank you for using our service.");
  }
 }
 void withdraw()
 {
  int withd;
  System.out.println("Withdraw");
  System.out.println("Current Balance: "+balance);
  System.out.println("Minimum Balance: "+min_bal);
  System.out.println("Enter amount: ");
  withd=sc.nextInt();
  if(balance-withd<=500)
  {
   System.out.println("ERORR: Balance less than minimum balance");
  }
  else
  {
   balance=balance-withd;
  }
 }
}
