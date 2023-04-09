import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int a, n;
        int[] N;
        System.out.println("What task you want to check?(Write number of task)");
        //input user choice
        int choice = sc.nextInt();
        //calls chosen method
        switch (choice) {
            case 1 -> {
                // length of array
                n = sc.nextInt();
                N = new int[n];
                //array filling
                for (int i = 0; i < n; i++) {
                    N[i] = sc.nextInt();
                }
                System.out.println(Task1.findMin(N, n - 1));
            }
            case 2 -> {
                //input length of array
                n = sc.nextInt();
                N = new int[n];
                //array filling
                for (int i = 0; i < n; i++) {
                    N[i] = sc.nextInt();
                }
                //prints (sum of elements / length of array)
                System.out.println(Task2.findAvg(N, n) / n);
            }
            case 3 -> {
                // input number
                n = sc.nextInt();
                //if counter > 1 (it doesn't take into account that the number is divided by itself) => not prime.
                if (Task3.isPrime(n, 0, 1) > 1) {
                    System.out.println("Composite");
                } else {
                    System.out.println("Prime");
                }
            }
            case 4 -> {
                //input number
                n = sc.nextInt();
                System.out.println(Task4.findFactorial(n, 1));
            }
            case 5 -> {
                //input number
                n = sc.nextInt();
                //0-th of fibonacci sequence is 0
                if (n == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(Task5.findFibonacci(n, 0, 1));
                }
            }
            case 6 -> {
                //input number and power of this number
                a = sc.nextInt();
                n = sc.nextInt();
                System.out.println(Task6.findPower(a, n, 1));
            }
            case 7 -> {
                //input length of array
                int num = sc.nextInt();
                Task7.reverseOrder(num);
            }
            case 8 -> {
                //input string
                String str = scan.nextLine();
                // array of elements from string
                char[] arr = str.toCharArray();
                //if here elements which is not digit is more than 0 => print NO
                if (Task8.isDigit(arr, arr.length - 1, 0) > 0) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
            case 9 -> {
                //input n and k
                n = sc.nextInt();
                int k = sc.nextInt();
                System.out.println(Task9.binomialCoefficient(n, k));
            }
            case 10 -> {
                //input two numbers
                a = sc.nextInt();
                int b = sc.nextInt();
                if (a > b) {
                    System.out.println(Task10.findGCD(a, b));
                } else {
                    System.out.println(Task10.findGCD(b, a));
                }
            }
        }
    }
}
