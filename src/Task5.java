import java.util.Scanner;

public class Task5 {
    public static void findFibonacci(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFibonacciFunc(n, 0, 1, 0));
    }
    public static int findFibonacciFunc(int n, int x1, int x2, int res){
        if (n > 1){
            res = findFibonacciFunc(n-1, x2, x1 + x2, x1 + x2);
        }
        return res;
    }
}
