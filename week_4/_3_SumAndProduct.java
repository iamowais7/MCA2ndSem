/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package week_4;

/**
 *
 * @author CSD
 */
import java.util.Scanner;
public class _3_SumAndProduct {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 4 numbers : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        int sum = a+b+c+d;
        int prod = a*b*c*d;

        System. out.println("Sum of "+a+", "+b+", "+c+" and "+d+" is : "+ sum);
        System. out.println("Product of "+a+", "+b+", "+c+" and "+d+" is : "+ prod);
        s.close();
    }

}
