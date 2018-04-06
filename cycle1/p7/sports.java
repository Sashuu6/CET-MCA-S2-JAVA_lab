import java.util.*;
public class sports extends test
{
 public int mark_sport;
 Scanner sc=new Scanner(System.in);
 public void getsp()
 {
  System.out.println("Input sports marks: ");
  mark_sport=sc.nextInt();
 }
 public void putsp()
 {
  System.out.println("sports marks: "+mark_sport);
 }
}
