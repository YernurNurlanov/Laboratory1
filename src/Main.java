import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What task you want to check?(Write number of task)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> Task1.findMin();
            case 2 -> Task2.findAvg();
            case 3 -> Task3.isPrime();
            case 4 -> Task4.findFactorial();
            case 5 -> Task5.findFibonacci();
        }
    }
}
