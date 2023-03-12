import java.util.Scanner;

public class ArithmeticOperations {

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }
    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }
    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }
    public static int division(int number1, int number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value 1 :");
        int a = sc.nextInt();
        System.out.print("Enter value 2 :");
        int b = sc.nextInt();
        int c = addition(a, b);
        System.out.println("addition of values a and b : "+c);

         c = subtraction(a, b);
        System.out.println("subtraction of values a and b : "+c);

        c = multiplication(a, b);
        System.out.println("multiplication of values a and b : "+c);

        c = division(a, b);
        System.out.println("division of values a and b : "+c);

    }
}