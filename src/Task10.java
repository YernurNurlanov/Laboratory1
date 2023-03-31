import java.util.Scanner;

public class Task10 {
    public static void findGCD(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println(findGCDFunc(a, b));
        }
        else{
            System.out.println(findGCDFunc(b, a));
        }
    }
    public static int findGCDFunc(int a, int b){
        if (a % b != 0){
            b = findGCDFunc(b, a % b);
        }
        return b;
    }
}
