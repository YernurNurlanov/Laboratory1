import java.util.Scanner;
public class Task3 {
    public static void isPrime(){
        Scanner sc = new Scanner(System.in);
        // input number
        int n = sc.nextInt();
        //if counter > 1 (it doesn't take into account that the number is divided by itself) => not prime.
        if (isPrimeFunc(n, 0, 1) > 1){
            System.out.println("Composite");
        }
        else{
            System.out.println("Prime");
        }

    }
    public static int isPrimeFunc(int n, int counter, int divider) {
        if (n != divider) {
            //if n divided into divider => counter++
            if (n % divider == 0) {
                counter = isPrimeFunc(n, counter + 1, divider + 1);
            } else {
                counter = isPrimeFunc(n, counter, divider + 1);
            }
        }
        return counter;
    }
}
