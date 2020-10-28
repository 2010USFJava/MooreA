package com.revature.overloading;

public class OrderOfOperations {
	
	static Integer numInteger=2;
	static Double d=34.3;
	
	//two int parameters 
    public static  int add(int x, int y) 
    { System.out.println("exact match");
        return (x + y); 
        
    } 
  
     
  
    // two different parameter
    public static  double add(double d, int y) 
    { System.out.println("different parameters");
        return (d + y); 
    }
    
    public void diffentType(Integer numInteger, int x)  
    {System.out.println("different types");
    		
         System.out.println(numInteger + x) ;
    }
    
    
    
    
    public static int Varargs(int... a) {
    	System.out.println("Varargs");
    	int v=0;
        for (int i : a) {
        	v+=i;
        }
        return v;
        
     }
	
	public static void main(String[] args) {
		
		
		
		OrderOfOperations s = new OrderOfOperations(); 
        System.out.println(add(5, 6)); 
        System.out.println(add(d, 3));
        s.diffentType(30,10);
        System.out.println( Varargs(11, 2, 30));
    
       
        
	}
}	
	
