import java.util.*;
public class str
{
 public void str_op(String a)
 {
  System.out.println("STRING SPACE REMOVAL :- ");
  a=a.replaceAll("\\s", "");
  System.out.println("string without spaces: "+a);
 }
 public void str_op(char[] a)
 {
  int i;
  System.out.println("STRING REVERSAL :- ");
  System.out.println("Reversed string : ");
  for (i=a.length-1;i>=0;i--)
  {
   System.out.print(a[i]);
  }
  System.out.println(" ");
 }
 public String str_op(String a,String b)
 {
  return a.concat(b);
 }
}
