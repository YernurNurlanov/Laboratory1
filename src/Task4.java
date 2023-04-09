public class Task4 {
    /*
    @ findFactorial - definition of function which finds factorial of number
    @ n - input number
    @ res - factorial of number
    @ return - returning factorial of number
     */
    public static int findFactorial(int n, int res){
        if (n > 1){
            // multiplication of res and number before it
            res = findFactorial(n - 1, res * n);
        }
        //n == 1 => return 1
        return res;
    }
}
