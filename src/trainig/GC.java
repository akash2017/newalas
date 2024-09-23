package trainig;

public class GC {
	
	/* for garbage collection-  
	
	unused object to be deleted using GC. 
	garbage collection automatically deletes objects which are no longer in use
	for that we have to make object eligible for garbage colletion.
	methods:
	1)make object as null
	2)reassign object to reference variable
	3)object inside a method.
	
*/
	GC t;
	static student s3;
	
	public static void main(String args[])
	{
		
		stud(); 
		student s=stud1(); //one eligible for gc
		stud1();   //2 eligible for gc
		stud3();
		
		
		GC t1=new GC();
		GC t2=new GC();
		
		t1.t=t2;
		t2.t=t1;
		t1=null;   //no object eligible for GC
		t2=null;  //all object eligible for GC
		
	}
	
	
	public static void stud()  //both eligible for gc
	{
		
		student s1=new student();
		student s2=new student();
		
		
	}
	
	
	public static student stud1()  //one eligible for gc
	{
		
		student s1=new student();
		student s2=new student();
		
		return s1;
		
	}
	
	public static student stud3()  //one eligible for gc
	{
		
		student s1=new student();
		student s3=new student();
		return s1;
		
	}
	
	//island of isolation
	
	
	
	
	
}
