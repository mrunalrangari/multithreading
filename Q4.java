package package1;

public class Q4 implements Runnable
{
	public static void disp()
	{
		synchronized(Q4.class)
		{	int i;
			for(i=0;i<11;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					
				}
			}
		}
	}
		public void run()
		{
			disp();
		}
	
	public static void main(String[] args) 
	{
		
		Q4 c1 = new Q4();
		Q4 c2 = new Q4();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		
	}
}

	


