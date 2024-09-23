package trainig;

public class inhabs {
	
	int a=10;
	int b=11;
	public static void main(String args[])
	{
		
		
		inhabs abc=new inhabs(4,2);
		System.out.println(abc.setA());
		
		
	}
	
	
	public void display()
	{
		
		
		System.out.println("ascasca");
	}
	inhabs(int a)  //Using ‘this’ keyword to refer to current class instance variables
	{
		
		a=a;
		
		System.out.println(a);
		this.display();
	}
	inhabs(int a,int b)  //Using ‘this’ keyword to refer to current class instance variables
	{
		
		this.a=a;
		this.b=b;
		System.out.println(a + b);
		
	}
	
	public int setA()
	{
		
		return a;
		
		
	}		
	}
	




