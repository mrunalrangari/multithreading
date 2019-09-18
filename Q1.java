package package1;

public class Q1 extends Thread 
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
		Q1 t = new Q1();
		t.start();
	}

}
