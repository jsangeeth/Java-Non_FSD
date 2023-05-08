package taskday5;

import java.io.IOException;


	class Example { 
		  void myMethod(int num)throws IOException, ClassNotFoundException{ 
		     if(num==1)
		        throw new IOException("IOException Occurred");
		     else
		        throw new ClassNotFoundException("ClassNotFoundException");
		  } 
		} 

	public class ThrowsExample {

		  public static void main(String args[]){ 
		   try{ 
		     Example obj=new Example(); 
		     obj.myMethod(0); 
		   }catch(Exception ex){
		     System.out.println(ex);
		    } 
		  }
		
}
