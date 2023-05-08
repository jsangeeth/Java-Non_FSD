package Tasks;

public class Outer {

	
		 
	    private static void outerMethod()
	    {
	        System.out.println("inside outerMethod");
	    }
	 
	    static class Inner {
	 
	        public static void display()
	        {
	            System.out.println("inside inner class Method");

	            outerMethod();
	        }
	    }
	
	 
	
	 
	    public static void main(String args[])
	    {
	        Outer.Inner.display();
	    }
	    }

