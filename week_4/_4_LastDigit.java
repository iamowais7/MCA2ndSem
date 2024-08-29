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
public class _4_LastDigit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any four digit number : ");
        int n = s.nextInt();

        int rev = 0;
        while(n>0)
        {
            int last = n%10;
//            System.out.println(last);
            rev = (rev*10) + last;
            n/=10;
        }
        while(rev>0)
        {
            int last = rev%10;
            System.out.println(last);
            rev/=10;
        }
        s.close();
    }

}
