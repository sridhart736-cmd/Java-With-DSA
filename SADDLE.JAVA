import java.util.Scanner;

public class SADDLE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            int minRow = matrix[i][0];
            int colIdx = 0;

            for (int j = 1; j < 3; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    colIdx = j;
                }
            }

            boolean isSaddle = true;
            for (int k = 0; k < 3; k++) {
                if (matrix[k][colIdx] > minRow) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point: " + minRow);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }
    }
}