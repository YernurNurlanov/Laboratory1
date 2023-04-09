public class Task9 {
    /*
    @ binomialCoefficient - definition of func which finds binomial coefficient
    @ n, k - input number
    @ return - returning binomial coefficient
     */
    public static double binomialCoefficient(int n, int k){
        //finds coefficient by formula (n!/(k!*(n-k)!))
        return findFactorialFunc(n, 1) / findFactorialFunc(k, 1) / findFactorialFunc(n - k, 1);
    }
    //finds factorial of needed number
    /*
    @ findFactorial - definition of function which finds factorial of number
    @ n - given number
    @ res - factorial of given number
    @ return - factorial of number
     */
    public static double findFactorialFunc(int n, double res){
        if (n > 1){
            res = findFactorialFunc(n - 1, res * n);
        }
        return res;
    }
}
