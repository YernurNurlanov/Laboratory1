import java.util.Scanner;

public class Task2 {
    public static void findAvg(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        for (int i = 0; i < n; i++){
            N[i] = sc.nextInt();
        }
        System.out.println(findAvgFunc(N, n) / n);
    }
    public static double findAvgFunc(int[] N, int n){
        if (n > 1){
            double avg = N[n - 1] + findAvgFunc(N, n - 1);
            return avg;
        }
        else {
            return N[n - 1];
        }
    }
}
