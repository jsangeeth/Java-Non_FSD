package taskday6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String args[]){  
	      List<String> arrList=new ArrayList<String>();  
	      arrList.add("Steve");
	      arrList.add("Tim");
	      arrList.add("Lucy");
	      arrList.add("Pat");
	      arrList.add("Angela");
	      arrList.add("Tom");
	  
	      System.out.println(arrList);
	  
	      arrList.set(0, "Lucy");//It replaces the element present at the specified index with the object o.
	      arrList.add(3, "Anu");//It adds the object o at the specified index in the ArrayList.
	      arrList.remove("Angela");//Removes object o from the ArrayList
	      arrList.remove(2);//Removes element from a given index.

	       System.out.println(arrList);
	      for(String arr:arrList)  
	          System.out.println(arr);  
	       }  
	     
}
