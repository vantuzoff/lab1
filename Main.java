import java.util.Scanner;

/**
 * @author vabantuz
 * @version 1.0
 * @see Fibonacci
 *
 */

public class Main {
    public static void main(String[] args){
            int N, NS;
        if(args.length == 0) {
            Scanner in = new Scanner(System.in);
            System.out.print("Print Amount of elements: ");
            N = in.nextInt();
            System.out.println("Amount is : " + N);
            System.out.print("Print Amount of elements to sum(unless 2): ");
            NS = in.nextInt();
            System.out.println("Amount to sum is: " + NS);
        } else {
            N = Integer.parseInt(args[0]);
            NS = Integer.parseInt(args[1]);
        }
        NS = NS - 2;
        N = N - 2;
        Fibonacci.outNums(N, NS);
    }
}