package practice;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class TrobulShoot {

	public static void main(String[]args) throws IOException{
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(in);
	
	System.out.print("Enter a name: ");
	String str = bf.readLine();
	System.out.println("Name : "+str);
	
	}
	
	
}
