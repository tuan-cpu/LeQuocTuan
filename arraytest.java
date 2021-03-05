package Lab01;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class arraytest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        int n;
        System.out.println("How many number in the array?");
        n = keyboard.nextInt();
        System.out.println("Enter all elements of the array:");
        for(var i=0;i<n;i++){
            array.add(keyboard.nextInt());
        }
        keyboard.close();
        Collections.sort(array);
        int sum=0;
        for(var i=0;i<n;i++){
            System.out.print(array.get(i)+" ");
            sum+=array.get(i);
        }
        System.out.println("\nSum of all elements is "+sum);
        System.out.println("Average value of all elements is "+ (double)sum/n);
        System.exit(0);
    }
}
