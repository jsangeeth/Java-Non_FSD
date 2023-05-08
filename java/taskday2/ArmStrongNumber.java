package taskday2;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
	    int cubeSum = 0;
	   
	    int r;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number = ");
	    int  n = sc.nextInt();
	    int  num = n;
	    while (num > 0)
	    {
	        r = num % 10;
	        cubeSum = cubeSum + (r * r * r);
	        num = num / 10;
	    }
	    if (n == cubeSum)
	    {
	        System.out.println(n+" is a Armstrong Number");
	    }
	    else
	    {
	        System.out.println(n+" is Not a Armstrong Number");
	    }
	}
}
