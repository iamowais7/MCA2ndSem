package week_3;
import java.util.Scanner;
public class _4_SumOfNEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of terms : ");
		int term = s.nextInt();
		int Sum = 0;
		for(int i=1; i<=term; i++)
		{
			Sum += 2*i;
		}
		System.out.println("Sum of "+term+" terms is : "+Sum);
		s.close();
	}

}
