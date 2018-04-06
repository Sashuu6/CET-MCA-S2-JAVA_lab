import java.util.Scanner;
public class lowertoupper
{
 public static void main(String args[])
 {
  String lowe;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter string: ");
  lowe=sc.nextLine();
  System.out.println("Uppercase: "+lowe.toUpperCase());
 }
}
