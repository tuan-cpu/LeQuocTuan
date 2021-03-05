package Lab01;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        int n;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Triangle height:");
        n = keyboard.nextInt();
        for(var i=0;i<n;i++){
            for(var j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        keyboard.close();
        System.exit(0);
    }
}
