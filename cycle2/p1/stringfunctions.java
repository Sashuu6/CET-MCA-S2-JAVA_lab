package stringeasy;
import java.lang.*;
import java.io.*;
import java.util.*;

public class stringfunctions
{
 int i;
 public void replicate(char x, int n)
 {
  for(i=0;i<n;i++)
  {
   System.out.print(x);
  }
  System.out.println();
 }
 public void upper(char x)
 {
  System.out.println(Character.toUpperCase(x));
 }
 public void lower(char x)
 {
  System.out.println(Character.toLowerCase(x));
 }
 public void subst( String s, int p,int l)
 {
  System.out.println(s.substring(p,p+l));
 }
}
