public class Fibonacci {
    static int numb;
    static int value;
    /**
     * Function that generate Fibonacci numbers,
     * counts its sum and counts what number on account it.
     * @param n3 amount of nums needed to sum
     * @param n amount of fibonacci numbers
     */

    static void outNums(int n, int n3){
        int n0 = 1;
        numb = 1;
        int n1 = 1;
        int sum = 2;
        System.out.println(numb+ ") "+n0);
        numb++;
        System.out.println(numb+ ") "+n1);
        numb++;
        for(int i = 0;i < n;i++){
            value = n0 + n1;
            if(n3 > i)
                sum += value;
            System.out.println(numb+") "+value);
            n0 = n1;
            n1 = value;
            numb++;
        }
        System.out.println();
        System.out.println("Sum of first " +(n3+2)+ " elements is: " +sum);
    }
}
