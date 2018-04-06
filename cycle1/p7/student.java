import java.util.*;
public class student
{
 public int roll;
 Scanner sc=new Scanner(System.in);
 public void getnum()
 {
  System.out.println("Input rollno : ");
  roll=sc.nextInt();
 }
 public void putnum()
 {
  System.out.println("Roll number: "+roll);
 }
}
