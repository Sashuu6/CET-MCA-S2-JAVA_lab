import java.util.*;
import java.util.Random;
class thread extends Thread
{ 
	static int num=0;
        int x;
        thread(int x)
        {
            this.x=x;
        }
        public void run()
        { 
		while(true)
		{
                if(x==1)
                {
			Random rand = new Random();
			num = rand.nextInt(50) ;
			System.out.println("Random number : "+num);
			try
                    {
                        Thread.sleep(2000);
                   
                    }catch(Exception e){}
               
                }
                else if(x==2)
                {
                    try
                    {
                        Thread.sleep(2000);
                   
                    }catch(Exception e){}
                    if(num%2==0)
                        System.out.println("its square : "+num*num);
                }
                else if(x==3)
                {
                    try
                    {
                        Thread.sleep(2000);
                   
                    }catch(Exception e){}
                    if(num%2!=0)
                        System.out.println("cube : "+num*num*num);
                }
            }
           
           
        }
} 
public class s9
{
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        thread a=new thread(1);
        thread b=new thread(2);
        thread c=new thread(3);
        a.start();
        b.start();
        c.start();
    }
   
}
