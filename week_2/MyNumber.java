package week_2;
import java.util.Scanner;
public class MyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number : ");
		double num = s.nextDouble();
		int numInteger = (int)(num);
		int numFloor = (int)(num);
		int numCeil = (((int)(num))+1);
		int numRound;
		double frac = num - numInteger;
		if(frac>=0.5) numRound = numCeil;
		else numRound = numFloor;
		System.out.println("numRound : "+numRound);
		System.out.println("numCeil : "+numCeil);
		System.out.println("numFloor : "+numFloor);
		System.out.println("numInteger : "+numInteger);
		s.close();
	}

}
