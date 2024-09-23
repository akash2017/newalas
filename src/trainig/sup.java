package trainig;
public class sup  {
	
	
	static int pow=10;
	int maxspeed=1200;
	 public  void supa()
	{
		System.out.println("develp");
		
		int[] arry= new int[10];
		
		arry[1]=120;
		arry[1]=120;
		
		
		
	}
	
	 public static void arys()
	 {
		 
		 
		 int arr[] = {1, 2, 3, 4, 5};
			
			int n= arr.length; //to get size of the array

			int sum = 0;

			for (int i = 0; i < n; i++) {

			sum += arr[i];
			
		}
			
			System.out.println(sum);
			int lar=arr[0];
			for(int j=1;j<n;j++)
			{
				if(arr[j]>lar)
				{
					lar=arr[j];
					
				}
				
				
			}
			
			System.out.println(lar);
	 }
	public static void display() 
	    { 
	        // print maxSpeed of base class (vehicle) 
	        System.out.println("Maximum Speed: "
	                           + pow); 
	    } 
	 
	 public static void main(String args[])
	 {
		 
	//pow=20;
	//supa();
	
	 arys();
	 
	 }
	 
}

