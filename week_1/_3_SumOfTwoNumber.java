/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package week_1;
import java.util.Scanner;
/**
 *
 * @author CSD
 */
public class _3_SumOfTwoNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();

		int sum = a+b;

		System.out.println("Sum of "+a+" and "+b+" is : "+sum);
    }

}
