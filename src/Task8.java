import java.util.Scanner;

public class Task8 {
    public static void isDigit(){
        Scanner sc = new Scanner(System.in);
        //input string
        String str = sc.nextLine();
        // array of elements from string
        char[] arr = str.toCharArray();
        //if here elements which is not digit is more than 0 => print NO
        if (isDigitFunc(arr, arr.length - 1, 0) > 0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
    public static int isDigitFunc(char[] arr, int length, int counter){
        if (length > 0){
            //if element isn't digit => (counter of not digit element)++
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
