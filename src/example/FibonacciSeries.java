package example;

public class FibonacciSeries {
    // Function to print N Fibonacci Number
//    static void Fibonacci(int N)
//    {
//        int num1 = 0, num2 = 1;
//
//        int counter = 0;
//
//        // Iterate till counter is N
//        while (counter < N) {
//
//            // Print the number
//            System.out.print(num1 + " ");
//
//            // Swap
//            int num3 = num2 + num1;
//            num1 = num2;
//            num2 = num3;
//            counter = counter + 1;
//        }
    //  }

    // Driver Code
//    public static void main(String args[])
//    {
//        // Given Number N
//        int N = 10;
//
//        // Function Call
//        Fibonacci(N);
//    }
//}
//recursion using fibonacci series
    public static void printFibonacciSeries(int n) {
        int first = 0;
        int next = 1;
        System.out.println(first);
        System.out.println(next);
        for (int i = 2; i <= n - 2; i++) {
            int sum = first + next;
            System.out.println(sum);
            first = next;
            next = sum;
        }
    }

 public static int fib(int n){
    if(n<=1)
    return n;
    return fib(n-1)+fib(n-2);

 }
         public static void
         main(String args[]) {
             int N = 4;
             for (int i = 0; i <= 10; i++) {
                 System.out.println(fib(i));
             }

         }       }