import java.util.Scanner;

public class Task6 {
    public static void findPower(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findPowerFunc(a, n, 1));
    }
    public static int findPowerFunc(int a, int n, int res) {
        if (n > 0) {
            res = findPowerFunc(a, n - 1, res * a);
        }
        return res;
    }
}
