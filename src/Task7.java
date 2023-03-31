import java.util.Scanner;

public class Task7 {
    public static void reverseOrder(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverseOrderFunc(num);
    }
    public static void reverseOrderFunc(int num) {
        Scanner scan = new Scanner(System.in);
        int x;
        if (num != 0) {
            x = scan.nextInt();
            reverseOrderFunc(num - 1);
            System.out.print(x + " ");
        }
    }
}
