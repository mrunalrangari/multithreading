package package1;

public class Q3 implements Runnable
{
 
	
	public void run()
	{
		disp();
		
	}
	synchronized public void disp()
	{
		//synchronized(this)
		int i;
		System.out.println("in run");
		for(i=0;i<6;i++)
		{
			System.out.println("exe"+i);
		}
	}
	public static void main(String[] args) 
	{
		Q3 q = new Q3();
		//Q3 q1 = new Q3();
		Thread t = new Thread(q);
		Thread t1 = new Thread(q);
		Thread t2 = new Thread(q);
		//Thread t1 = new Thread(q1);
		t.start();
		t1.start();
		t2.start();
	}

}
