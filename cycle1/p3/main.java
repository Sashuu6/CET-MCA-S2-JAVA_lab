import java.util.*;
public class main
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  stud stu[]=new stud[5];
  int n,i;
  System.out.println("Enter number of students: ");
  n=sc.nextInt();
  for(i=0;i<n;i++)
  {
   stu[i]=new stud();
   stu[i].read();
   stu[i].tot();
   stu[i].avg();
   stu[i].check();
   stu[i].grade();
  } 
 }
}
