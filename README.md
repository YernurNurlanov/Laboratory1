# Laboratory1
## Main
Function with which you can select which task to check
## Task1
*Description:* Print the minimum value of an array

*Explanation:* When `n=0` => return furst element of array. Then find min of `N[n]` and result of recursive execution.
```
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
```
## Task2
*Description:* Print average value of array

*Explanation:* When `n=0` => return furst element of array. Then find sum of `N[n]` and result of recursive execution. Then sum divide by length of array.
```
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
```
## Task3
*Description:* Check a number for a prime

*Explanation:* Divider from 1 to `n-1`. If `n%divider==0` => counter++. If `counter>1` number is not prime.
```
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
```
## Task4
*Description:* Print factorial number

*Explanation:* When `n=1` => return 1. Then find multiplication of `n` and result of recursive execution.
```
public static int findFactorial(int n, int res){
        if (n > 1){
            // multiplication of res and number before it
            res = findFactorial(n - 1, res * n);
        }
        //n == 1 => return 1
        return res;
    }
```
## Task5
*Description:* Print the number on n-th position of fibonacci sequence
```
public static int findFibonacci(int n, int x1, int x2){
        if (n > 1){
            //find next number of Fibonacci
            x2 = findFibonacci(n-1, x2, x1 + x2);
        }
        return x2;
    }
```
## Task6
*Description:* Print `a^n`

*Explanation:* `a` multiplicates with `a` `n-1` times
```
public static int findPower(int a, int n, int res) {
        if (n > 0) {
            //multiplication of res and a (n times)
            res = findPower(a, n - 1, res * a);
        }
        return res;
    }
```
## Task7
*Description:* Print reverse array

*Explanation:* elements of array inputs `n` times. Because of reverse execution elements of array outputs in reverse order.
```
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
```
## Task8
*Description:* Check whether “s” is all consists of digit

*Explanation:* If element of string is not digit `counter++`. If `counter>1` prints `No`.
```
public static int isDigit(char[] arr, int length, int counter){
        if (length > 0){
            //if element isn't digit => (counter of not digit element)++
            if (Character.isDigit(arr[length])){
                counter = isDigit(arr, length - 1, counter);
            }
            else {
                counter = isDigit(arr, length - 1, counter + 1);
            }
        }
        return counter;
    }
```
## Task9
*Description:* Print binomial coefficient

*Explanation:* Finds binomial coefficient by formula `n!/(k!*(n-k)!)`. Factorial of numbers will be found by the second function.
```
public static double binomialCoefficient(int n, int k){
        //finds coefficient by formula (n!/(k!*(n-k)!))
        return findFactorialFunc(n, 1) / findFactorialFunc(k, 1) / findFactorialFunc(n - k, 1);
    }
public static double findFactorialFunc(int n, double res){
        if (n > 1){
            res = findFactorialFunc(n - 1, res * n);
        }
        return res;
    }
```
## Task10
*Description:* Find GCD.

*Explanation:* Compute GCD by Euclidean Algorithm.
```
public static int findGCD(int a, int b){
        if (a % b != 0){
            //compute GCD by Euclidean Algorithm
            b = findGCD(b, a % b);
        }
        return b;
    }
```
