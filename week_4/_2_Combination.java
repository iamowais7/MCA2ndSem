package Week_4;
import java.util.Scanner;
public class _2_Combination {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 digit number : ");
        int num = s.nextInt();

        int arr[] = new int[3];

        for(int i = 0; i<3; i++)
        {
            arr[i]=num%10;
            num/=10;
        }
        for(int i = 0; i<3;i++)
        {
            for(int k=0; k<3; k++){
                    for(int j=0; j<3; j++)
                    {
                        if ((arr[i] != arr[k]) && (arr[k] != arr[j])&& (arr[j])!=arr[i])
                            System.out.println(arr[i]+", "+arr[k]+", "+arr[j]);
                            
                    }
            }
        }
        s.close();
    }

}
