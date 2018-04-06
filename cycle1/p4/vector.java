import java.util.*;
public class vector
{
 private int a[] = new int[10];
 private int n;
 Scanner sc = new Scanner(System.in); 
 public vector()
 {
  int i;
  System.out.print("Enter number of elements: ");
  n= sc.nextInt();
  for(i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  sum();
  largest();
  counteven();
 }
 public void sum()
 {
  int i,sum=0;
  for(i=0;i<n;i++)
  {
   sum=sum+a[i];
  }
  System.out.println("Sum : "+sum);
 }
 public void largest()
 {
  int i,lar=0,loc=0;
  for(i=0;i<n;i++)
  {
   if(a[i]>lar)
   {
    lar=a[i];
    loc=i+1;
   }
  }
  System.out.println("Largest number is "+lar+". It is at location "+loc);
 }
 public void counteven()
 {
  int i,cnt=0;
  for(i=0;i<n;i++)
  {
   if(a[i]%2==0)
   {
    cnt++;
   }
  }
  System.out.println("The number of even numbers in this vector is "+cnt);
 }
}
