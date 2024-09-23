package trainig;
// Base class vehicle 
class asa { 
    int maxSpeed = 120; 
} 
  
// sub class Car extending vehicle 
class Car extends sup { 
    int maxSpeed = 180; 
  
    void display() 
    { 
        // print maxSpeed of base class (vehicle) 
        System.out.println("Maximum Speed: "
                           + super.maxspeed); 
    } 
    
    void message()
    {
    	display();
    	super.display();
    	
    }
} 
  
// Driver Program 
class Test { 
    public static void main(String[] args) 
    { 
        Car small = new Car(); 
        small.message(); 
    } 
}