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
public class _4_TempConverter {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temp. in fahrenheit : ");

		float F = s.nextFloat();

		float C = (float) ((F - 32.0)/1.8);

		System.out.println(F+"F is equal to "+C+"C");
	}

}
