import java.util.*;


class Num extends Thread
{
	public void run()
	{
		int n =0;
		
		Random r =new Random();
		try
		{
			for(int i=0;i<6;i++)
			{
				n=r.nextInt(100);
				
				System.out.println("First Thread  : GENERATED number is     : "+n);
				Thread t2=new Thread(new SNum(n));
				t2.start();
				
				Thread t3=new Thread(new CNum(n));
				t3.start();
				Thread.sleep(1000);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class SNum implements Runnable
{
	int x;
	
	public SNum (int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("Second Thread : SQUARE of the number is : "+ x*x);
	}
}

class CNum implements Runnable
{
	int x;
	public CNum(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("Third Thread  : CUBE of the Number is   : "+ x*x*x);
		System.out.println();
	}
}
public class MultiThread 
{

	public static void main(String[] args) 
	{
		Num n=new Num();
		n.start();

	}

}
