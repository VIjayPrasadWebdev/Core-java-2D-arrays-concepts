import java.util.Scanner;

public class twod_matrix {
    public static void main(String[] x) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][]=new int [2][2];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values for A");
        {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    a[i][j] = s.nextInt();
                }

            }
            System.out.println("Enter the values for B");
            {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        b[i][j] = s.nextInt();
                    }

                }
            }
            System.out.println("Addition for A & B");
            {
                for(int i=0; i<2; i++)
                {
                    for(int j=0; j<2; j++)
                    {
                         c[i][j] = a[i][j] + b[i][j];
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
