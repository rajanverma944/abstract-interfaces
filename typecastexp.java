
import java.util.Scanner;
class Typecastingstring
{
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	int a=Integer.parseInt(s1);
	int b=Integer.parseInt(s2);
	public void max()
	{
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else if(a==b)
		{
			System.out.println("Both numbers are equal");
		}
		else if(b>a)
		{
			System.out.println(b+" is greater");
		}
	}
	public static void main(String args[])
	{
		Typecastingstring t=new Typecastingstring();
		t.max();
	}
}
