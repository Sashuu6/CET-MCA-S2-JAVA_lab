import java.util.*;
public class stud
{
 int rollno,m1,m2,m3,tot;
 String name;
 float avge,per;
 Scanner sc=new Scanner(System.in);
 public void read()
 {
  System.out.print("Enter name: ");
  name=sc.nextLine();
  System.out.print("Enter rollno: ");
  rollno=sc.nextInt();
  System.out.print("Enter mark 1: ");
  m1=sc.nextInt();
  System.out.print("Enter mark 2: ");
  m2=sc.nextInt();
  System.out.print("Enter mark 3: ");
  m3=sc.nextInt();
  System.out.println("\nProgress Report:- ");
  System.out.println("Name: "+name);
  System.out.println("Roll Number: "+rollno);
  System.out.println("Mark 1: "+m1);
  System.out.println("Mark 2: "+m2);
  System.out.println("Mark 3: "+m3);
 }
 
 public void tot()
 {
  tot=m1+m2+m3;
  System.out.println("Total Marks: "+tot);
 }
 
 public void avg()
 {
  avge=(float)(tot/3);
  System.out.println("Average: "+avge);
  System.out.println("Percentage: "+avge+"%");
 }
 
 public void check()
 {
  if(m1>45)
  {
   if(m2>45)
   {
    if(m3>45)
    {
     System.out.println("Status: Passed");
    }
    else
    {
     System.out.println("Status:Failed");
    }
   }
   else
   {
    System.out.println("Status:Failed");
   }
  }
  else
  {
   System.out.println("Status:Failed");
  }
 }
 
 public void grade()
 {
  if(avge>=75)
  {
   System.out.println("Status: Distinciton");
  }
  else if(avge>=60)
  {
   System.out.println("Status: First Class");
  }
  else if(avge>=50)
  {
   System.out.println("Status: Second Class");
  }
 }
} 
