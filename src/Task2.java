public class Task2 {
    /*
    @ findAvg - definition of min
    @ N - array
    @ n - length of array
    @ return - returning sum of all elements
     */
    public static double findAvg(int[] N, int n){
        if (n > 1){
            //finds the sum of all the elements
            return N[n - 1] + findAvg(N, n - 1);
        }
        else {
            // n == 1 => return first element of array
            return N[n - 1];
        }
    }
}
