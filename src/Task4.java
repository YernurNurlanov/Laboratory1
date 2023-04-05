import java.util.Scanner;

public class Task4 {
    public static void findFactorial(){
        Scanner sc = new Scanner(System.in);
        //input number
        int n = sc.nextInt();
        System.out.println(findFactorialFunc(n, 1));
    }
    public static int findFactorialFunc(int n, int res){
        if (n > 1){
            // multiplication of res and number before it
            res = findFactorialFunc(n - 1, res * n);
        }
        //n == 1 => return 1
        return res;
    }
}
