import java.util.Scanner;

public class simple_program {
    public static void main(String[] x) {
        int total = 0;
        int row_column[][] = new int[2][2];

        System.out.println("Enter the inputs");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < row_column.length; i++) {
            for (int j = 0; j < row_column.length; j++) {
                row_column[i][j] = s.nextInt();
            }
        }
        System.out.println("The answer of 2d Arrray is ");
        for (int i = 0; i < row_column.length; i++) {
            for (int j = 0; j < row_column.length; j++) {
                total =total +row_column[i][j];
                System.out.print(row_column[i][j] + " ");
            }

            System.out.println();

        }
        System.out.println("The Total of 2d array is " + total);
    }
}

//sum of two elements

//even numbers

// count of even numbers