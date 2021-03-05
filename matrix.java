package Lab01;
import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the matrices:");
        n = keyboard.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int i,j;
        System.out.println("Enter the first matrix row by row:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix1[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Enter the second matrix row by row:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matrix2[i][j] = keyboard.nextInt();
            }
        }
        int[][] sum = new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                sum[i][j] = matrix1[i][j]+matrix2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }

        keyboard.close();
        System.exit(0);
    }
}
