package trainig;

public class getset {
	
	 private int length;
	 private int breadth;
	 private int hight;

	 getset(int length,int breadth){//setter
		
		
		this.length= length;
		this.breadth=breadth;
		
	}
	
	
	public int getval()  //getter
	{
		
		int area=length*breadth;
	
		return area;
	}
	
	
	public void setH(int hight)
	{
		this.hight= hight;
		
	}
	
	public int getH()
	{
		
		int area=hight;
		
		return area;
		
	}
	
	
	public static void main(String args[])
	{
		
		getset gs=new getset(10,20);
		System.out.println(gs.getval());
		gs.setH(10);
		System.out.println(gs.getH());
		
	}
	
	
}


