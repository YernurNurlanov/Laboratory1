import java.util.Scanner;
public class Task3 {
    public static void isPrime(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrimeFunc(n, 0, 1) > 1){
            System.out.println("Composite");
        }
        else{
            System.out.println("Prime");
        }

    }
    public static int isPrimeFunc(int n, int counter, int divider) {
        if (n != divider) {
            if (n % divider == 0) {
                counter = isPrimeFunc(n, counter + 1, divider + 1);
            } else {
                counter = isPrimeFunc(n, counter, divider + 1);
            }
        }
        return counter;
    }
}
