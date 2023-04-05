import java.util.Scanner;

public class Task2 {
    public static void findAvg(){
        Scanner sc = new Scanner(System.in);
        //input length of array
        int n = sc.nextInt();
        int[] N = new int[n];
        //array filling
        for (int i = 0; i < n; i++){
            N[i] = sc.nextInt();
        }
        //prints (sum of elements / length of array)
        System.out.println(findAvgFunc(N, n) / n);
    }
    public static double findAvgFunc(int[] N, int n){
        if (n > 1){
            //finds the sum of all the elements
            return N[n - 1] + findAvgFunc(N, n - 1);
        }
        else {
            // n == 1 => return first element of array
            return N[n - 1];
        }
    }
}
