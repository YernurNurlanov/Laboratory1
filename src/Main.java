import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int n = sc.nextInt();
        String str = scanner.nextLine();
        System.out.println(Min(n, str));
    }
    public static int Min(int n, String str){
        int[] N = new int[n];
        String[] parts = str.split(" ");
        for (int i = 0; i < n; i++){
            N[i] = Integer.parseInt(parts[i]);
        }
        int min = N[0];
        for (int i = 1; i < n; i++){
            if (min > N[i]){
                min = N[i];
            }
        }
        return min;
    }
}