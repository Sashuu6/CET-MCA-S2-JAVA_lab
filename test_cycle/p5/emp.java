import java.util.Scanner;
public class emp
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String name;
  int emp_code,basic,hra=1000,cca=500,lic=2000;
  float da,pf,gross;
  System.out.print("Enter employee name: ");
  name=sc.nextLine();
  System.out.print("Enter employee code: ");
  emp_code=sc.nextInt();
  System.out.print("Enter basic pay: ");
  basic=sc.nextInt();
  da=(72*basic)/100;
  pf=(5*(basic+da))/100;
  gross = calc(basic,da,pf,hra,cca,lic);
  System.out.println("\t     Salary Slip");
  System.out.println("EmpCode: "+emp_code+"\t\t"+"EmpName: "+name);
  System.out.println("BP: "+basic+"\t\t"+"PF: "+pf);
  System.out.println("DA: "+da+"\t\t"+"LIC: "+lic);
  System.out.println("HRA: "+hra+"\t\t"+"cca: "+cca);
  System.out.println("--------------------------------------------");
  System.out.println("\t"+"Gross Salary: "+gross);
 }
 public static float calc(float basic,float da,float pf,int hra,int cca,int lic)
 {
  return basic+da+hra+cca-(pf+lic);
 }
}
