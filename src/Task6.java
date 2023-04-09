public class Task6 {
    /*
    @ findPower - definition func which finds “a^n”
    @ 'a' - input number
    @ n - power of 'a'
    @ res - a^n
    @ return - returning a^n
     */
    public static int findPower(int a, int n, int res) {
        if (n > 0) {
            //multiplication of res and a (n times)
            res = findPower(a, n - 1, res * a);
        }
        return res;
    }
}
