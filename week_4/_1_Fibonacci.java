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
public class _1_Fibonacci {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of term of fibonacci series that you want : ");
        int m = s.nextInt();
        int first = 0, second = 1, next;

        int count = 0;
        do
        {
            System.out.print(first+", ");
            count++;
            next = first + second;
            first = second;
            second = next;
        }while(count != m);
        s.close();
    }

}
