import java.util.Scanner;

public class Task5 {
    public static void findFibonacci() {
        Scanner sc = new Scanner(System.in);
        //input number
        int n = sc.nextInt();
        //0-th of fibonacci sequence is 0
        if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println(findFibonacciFunc(n, 0, 1));
        }
    }
    public static int findFibonacciFunc(int n, int x1, int x2){
        if (n > 1){
            //find next number of Fibonacci
            x2 = findFibonacciFunc(n-1, x2, x1 + x2);
        }
        return x2;
    }
}
