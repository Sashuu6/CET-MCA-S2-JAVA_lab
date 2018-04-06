public class printmessage
{
 public static void main(String args[])
 {
  String sen="HELLO WORLD";
  int i;
  for(i=0;i<=10;i++)
  {
   System.out.println(sen);
   sen=sen.substring(0,sen.length()-1);
  }
 }
}
