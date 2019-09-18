package package1;

public class Q2 implements Runnable 
{
	public void run()
	{
		char ch;
		for(ch='A';ch<'k';ch++)
		{
			System.out.println(ch);
		}
	}
	public static void main(String argts[])
	{
		Q2 q = new Q2();
		Thread t = new Thread(q);
		t.start();
	}
}
