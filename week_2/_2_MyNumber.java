package week_2;
import java.util.Scanner;
public class _2_MyNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number : ");
		double num = s.nextDouble();
		System.out.println("What do you want to perform : ");
		System.out.println("Enter 1 for Round value : ");
		System.out.println("Enter 2 for Ceil value : ");
		System.out.println("Enter 3 for Floor value : ");
		System.out.println("Enter 0 for Exit : ");
		int op = s.nextInt();
		switch(op)
		{
		case(1):
			System.out.println("Round value of "+num+" is : "+Round(num));
		break;
		case(2):
			System.out.println("Ceil value of "+num+" is : "+Ceil(num));
		break;
		case(3):
			System.out.println("Floor value of "+num+" is : "+Floor(num));
		break;
		case(0):
			System.out.println("Exiting Program...");
		break;
		default:
			System.out.println("Invalid Input");
		}
	s.close();
			
	}
	private static int Round(double num)
	{
		double frac = num - (int)(num);
		int numRound;
		if(frac>=0.5) 
			{
				numRound = (((int)(num)+1));
				return numRound;
			}
		else
			numRound = (int)(num);
		return numRound;
	}
	private static int Ceil(double num)
	{
		int numCeil = (((int)(num))+1);
		return numCeil;
	}
	private static int Floor(double num)
	{
		int numFloor = (int)(num);
		return numFloor;
	}

}
