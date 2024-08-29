package week_3;

public class _3_SumOfReciprocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Sum = 0;
		for(int i=1; i<=10; i++)
		{
			Sum += (1/(double)i);
		}
		System.out.println("Sum of reciprocal upto 1/10 is : "+Sum);
	}

}
