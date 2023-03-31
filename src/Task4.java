import java.util.Scanner;

public class Task4 {
    public static void findFactorial(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFactorialFunc(n, 1));
    }
    public static int findFactorialFunc(int n, int res){
        if (n > 1){
            res = findFactorialFunc(n - 1, res * n);
        }
        return res;
    }
}
