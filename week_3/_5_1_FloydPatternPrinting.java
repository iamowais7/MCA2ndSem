package week_3;
import java.util.Scanner;
public class _5_1_FloydPatternPrinting {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Rows : ");
		int n = s.nextInt();
		int a = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		s.close();
	}
}
