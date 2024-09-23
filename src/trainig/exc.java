package trainig;

public class exc {
	
	
	public static void main(String args[])
	{
		
		try {
			
			int a=10;
			int b=0;
			
			int c=a/b;
			
			System.out.println(c);
			
		}
		
		catch(ArithmeticException e)
		{
		System.out.println("arith maths");
	}
		
		
		try
		{
			
			
			int a[]= new int[4];
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("outbound");
			
		}
		
	}
	
}
