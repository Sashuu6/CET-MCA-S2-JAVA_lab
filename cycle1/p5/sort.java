import java.util.*;
public class sort
{
 private int a[] = new int[10];
 private int n;
 Scanner sc = new Scanner(System.in);
 private void read()
 {
  int i;
  System.out.print("Input number of elements: ");
  n=sc.nextInt();
  for(i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("The array is :-\n");
  for(i=0;i<n;i++)
  {
   System.out.print(a[i]+"\t");
  }
  System.out.println(" ");
 }
 public void bsort()
 {
  int i,j,temp;
  read();
  for(i=0;i<n-1;i++)
  {
   for(j=0;j<n-i-1;j++)
   {
    if(a[j]>a[j+1])
    {
     temp=a[j];
     a[j]=a[j+1];
     a[j+1]=temp;
    }
   } 
  }
  disp();
 }
 private void disp()
 {
  int i;
  System.out.println("The sorted array is :-\n");
  for(i=0;i<n;i++)
  {
   System.out.print(a[i]+"\t");
  }
  System.out.println(" ");
 } 
}
