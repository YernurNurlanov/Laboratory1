import java.util.Scanner;

public class Task8 {
    public static void isDigit(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        if (isDigitFunc(arr, arr.length - 1, 0) > 0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
    public static int isDigitFunc(char[] arr, int length, int counter){
        if (length > 0){
            if (Character.isDigit(arr[length])){
                counter = isDigitFunc(arr, length - 1, counter);
            }
            else {
                counter = isDigitFunc(arr, length - 1, counter + 1);
            }
        }
        return counter;
    }
}
