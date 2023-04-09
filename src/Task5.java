public class Task5 {
    /*
    @ findFibonacci - definition of func which finds n-th elements in Fibonacci sequence
    @ n - position of Fibonacci number
    @ x1 - first element of Fibonacci sequence
    @ x2 - second element of Fibonacci sequence
    @ return - returning n-th elements in Fibonacci sequence
     */
    public static int findFibonacci(int n, int x1, int x2){
        if (n > 1){
            //find next number of Fibonacci
            x2 = findFibonacci(n-1, x2, x1 + x2);
        }
        return x2;
    }
}
