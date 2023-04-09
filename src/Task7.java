import java.util.Scanner;
public class Task7 {
    /*
    @ reverseOrder - definition of func which returns given array in reverse order
    @ num - length of array
    @ x - element of array
    @ return - returning array in reverse order
    */
    public static void reverseOrder(int num) {
        Scanner scan = new Scanner(System.in);
        int x;
        if (num != 0) {
            //input element of array
            x = scan.nextInt();
            reverseOrder(num - 1);
            //print element
            System.out.print(x + " ");
        }
    }
}
