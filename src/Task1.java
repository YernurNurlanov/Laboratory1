import java.util.Scanner;
public class Task1 {
    public static void findMin(){
        Scanner sc = new Scanner(System.in);
        // length of array
        int n = sc.nextInt();
        int[] N = new int[n];
        //array filling
        for (int i = 0; i < n; i++){
            N[i] = sc.nextInt();
        }
        System.out.println(findMinFunc(N, n - 1));
    }
    public static int findMinFunc(int[] N, int n){
        if (n > 0){
            // check previous element
            int min = findMinFunc(N, n - 1);
            return Math.min(min, N[n]);
        }
        else{
            // n == 0 => return first element of array
            return N[n];
        }
    }
}