public class Task3 {
    /*
    @ isPrime - definition of function to check if number is prime
    @ n - input number
    @ counter - counts divisors
    @ return - returning divisor number
     */
    public static int isPrime(int n, int counter, int divider) {
        if (n != divider) {
            //if n divided into divider => counter++
            if (n % divider == 0) {
                counter = isPrime(n, counter + 1, divider + 1);
            } else {
                counter = isPrime(n, counter, divider + 1);
            }
        }
        return counter;
    }
}
