package trainig;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class colletion {
	
	public static void main(String args[])
	{
		ary();
		
	}
	
	public static void ary()
	{
		
		int[]  a=new int[10];  ///fixed in size and store homogeneous data
		
		int[]  b=new int['a']; //will takr unicode for char a.
		
		//maximum value of array is exceeded then, it will throw interger number si too long error.
	a[0]=1;
	
	
	
	System.out.println(a[0]);
	System.out.println(a.getClass().getName());  //get super class ,not available to programmer
	System.out.println(a.length);
	//arrays of arrays
	int[][] c= new int[2][];
	
	c[0]= new int[2];
	c[1]= new int[3];
	
	ArrayList l= new ArrayList();
	l.add(99);
	l.add(0,120);
	l.add("C");	
	System.out.println(l);	
		
	
	
	}

}
