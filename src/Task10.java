public class Task10 {
    /*
    @ findGCD - definition of func which finds GCD
    @ a, b - input number
    @ return - returning GCD
     */
    public static int findGCD(int a, int b){
        if (a % b != 0){
            //compute GCD by Euclidean Algorithm
            b = findGCD(b, a % b);
        }
        return b;
    }
}
