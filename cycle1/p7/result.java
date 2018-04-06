import java.util.*;
public class result extends sports
{
 public float tot;
 Scanner sc=new Scanner(System.in);
 public void tot_marks()
 {
  tot=mark1+mark2+mark_sport;
 }
 public void tot_mks()
 {
  System.out.println("Total Marks: "+tot);
 }
 public result()
 {
  getnum();
  getmarks();
  getsp();
  tot_marks();
  System.out.println("Progress Report:-");
  putnum();
  putmarks();
  putsp();
  tot_mks();
 }
}
