package package1;

public class Q5 extends Thread
{
	public static void disp()
	{
		synchronized(Q5.class)
		{
			int i;
			for(i=1;i<=50;i++)
			{
				System.out.println(i);
			}
		}
	}
	public static void disp1(){
		synchronized(Q5.class)
		{
			int j;
			for(j=50;j>=1;j--)
			{
				System.out.println(j);
			}
		}
	}
	public void run()
	{
		disp();
		disp1();
		
	}
	public static void main(String[] args) 
	{
		Q5 c1 = new Q5();
		Q5 c2 = new Q5();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		
	}
}
