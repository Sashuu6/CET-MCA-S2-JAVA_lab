import java.util.*;
public class randomize
{
 String s;
 Scanner sc=new Scanner(System.in);
 public randomize()
 {
  input();
  process();
 }
 public void input()
 {
  System.out.println("Input a five letter word: ");
  s=sc.nextLine();
 }
 public void process()
 {
  char[] str=s.toCharArray();
  int i,j,k,count=0;
  if(s.length()>5)
  {
   System.out.println("ERROR 101: Length more than 5");
  }
  else if(s.length()<5)
  {
   System.out.println("ERROR 102: Length less than 5");
  }
  else
  {
   System.out.println("The 3-letter words are:-");
   for(i=0;i<s.length();i++)
   {
    for(j=0;j<s.length();j++)
    {
     for(k=0;k<s.length();k++)
     {
      if(str[i]!=str[j] && str[j]!=str[k] && str[k]!=str[i])
      {
       System.out.println(str[i]+""+str[j]+""+str[k]);
       count++;
      }
     }
    }
   }
   System.out.println("The number of words in "+s+" is "+count);
  }
 }
}
