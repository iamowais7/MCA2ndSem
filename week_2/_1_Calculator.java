package week_2;

import java.util.Scanner;

public class _1_Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Enter which operation do you want to perform : ");
		System.out.println("Enter 1 for Addition : ");
		System.out.println("Enter 2 for Subtraction : ");
		System.out.println("Enter 3 for Multiplication : ");
		System.out.println("Enter 4 for division : ");	
		System.out.println("Enter 5 for Maximum : ");
		System.out.println("Enter 6 for Minimum : ");
		System.out.println("Enter 0 for Exit : ");
		int op = s.nextInt();
		switch(op)
		{
			case(1):
				System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
				break;
			case(2):
				System.out.println("Difference of "+a+" and "+b+" is : "+(a-b));
				break;
			case(3):
				System.out.println("Product of "+a+" and "+b+" is : "+(a*b));
				break;
			case(4):
				if(b==0) System.out.println("Denominator can't be zero");
				else System.out.println("Quotient of "+a+" and "+b+" is : "+((float)(a)/(float)(b)));
				break;
			case(5):
				max(a, b);
				break;
			case(6):
				min(a, b);
				break;
			case(0):
				System.out.println("Exiting program...");
				break;
			default:
				System.out.println("Invalid Input : ");
				break;
		}
	}
	private static String max(int a, int b) {
		if(a>b) System.out.println("Maximum of "+a+" and "+b+" is : "+a);
		else if(b>a) System.out.println("Maximum of "+a+" and "+b+" is : "+b);
		else System.out.println(a+" and "+b+" both are equal");
		return null;
	}
	private static String min(int a, int b) {
		if(a>b) System.out.println("Minimum of "+a+" and "+b+" is : "+b);
		else if(b>a) System.out.println("Minimum of "+a+" and "+b+" is : "+a);
		else System.out.println(a+" and "+b+" both are equal");
		return null;
	}
}