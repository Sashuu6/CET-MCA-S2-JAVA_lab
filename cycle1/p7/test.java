import java.util.*;
public class test extends student
{
 public int mark1;
 public int mark2;
 Scanner sc=new Scanner(System.in);
 public void getmarks()
 {
  System.out.println("Input mark1: ");
  mark1=sc.nextInt();
  System.out.println("Input mark2: ");
  mark2=sc.nextInt();
 }
 public void putmarks()
 {
  System.out.println("Mark 1: "+mark1);
  System.out.println("Mark 2: "+mark2);
 }
}
