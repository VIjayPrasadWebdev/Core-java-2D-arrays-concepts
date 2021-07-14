import java.util.Scanner;

public class Count_and_total_of_even {
    public static void main(String []x)
    {
        int even[][]=new int[3][3], count_even=0, sum_of_even=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                even[i][j]=s.nextInt();
            }

        }
        System.out.println("The calculation process ...............................");

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                if(even[i][j] %2==0)
                {
                    count_even++;

                    // count_even++ makes no matrix form
                    System.out.println(even[i][j]);
                    sum_of_even=sum_of_even + even[i][j];

                }
                }

            System.out.println();
        }
        System.out.println("The total of even is " + sum_of_even);
    }
}
