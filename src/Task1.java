public class Task1 {
    /*
    @ findMin - definition of min
    @ N - array
    @ n - length of array
    @ return - returning minimum of function
     */
    public static int findMin(int[] N, int n){
        if (n > 0){
            // check previous element
            int min = findMin(N, n - 1);
            // use of a built-in function (min of two elements)
            return Math.min(min, N[n]);
        }
        else{
            // n == 0 => return first element of array
            return N[n];
        }
    }
}