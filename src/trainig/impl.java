package trainig;

interface imp1{
	
	
	public static  int new1(int b)
	{
		int a=b*10;
	 System.out.println("interface1");
	 
	 return a;
	}
	
	
	
}

interface imp2
{
	final int account=1;
	public static int new2(int c, int d)
	{
		
		System.out.println("interface2");
		int e=c*d;
	    return e;
		
	}
		
}


interface imp4 extends imp1
{
	public static int new4(int c, int d, int f)
	{
		
		System.out.println("interface2");
		int e=c*d*f;
	    return e;
		
	}
}

public class impl implements imp1,imp2{
	
	
	public static void new1(int a, int b)
	{
		int val1=imp1.new1(a);
		int val2= imp2.new2(a,b);
		System.out.println(val1 + val2);
	}
	public static void new1(int a, int b,int c)
	{
		int val1=imp1.new1(a);
		int val2= imp4.new4(a,b,c);
		System.out.println(val1 + val2);
	}
	
	
	
	public static void main(String args[])
	{
		
		impl i=new impl();
		i.new1(10, 20);
		i.new1(10,20,30);
		System.out.println();
		
		
	}
}