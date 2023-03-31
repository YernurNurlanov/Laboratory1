import java.util.Scanner;

public class Task9 {
    public static void binomialCoefficient(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCoefficientFunc(n, k));
    }
    public static double binomialCoefficientFunc(int n, int k){
        return findFactorialFunc(n, 1) / findFactorialFunc(k, 1) / findFactorialFunc(n - k, 1);
    }
    public static double findFactorialFunc(int n, double res){
        if (n > 1){
            res = findFactorialFunc(n - 1, res * n);
        }
        return res;
    }
}
