package week_3;
import java.util.Scanner;
public class _1_CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 10 numbers : ");
		int [] arr = new int[10];
		int CountEven = 0, CountOdd = 0;

		for(int i = 0; i<10; i++)
		{
			arr[i] = s.nextInt();
                        if(arr[i] % 2 == 0) CountEven++;
			else CountOdd++;
		}
		System.out.println("Counting Of Even Numbers : "+CountEven);
		System.out.println("Counting Of Odd Numbers : "+CountOdd);
                s.close();
	}

}
