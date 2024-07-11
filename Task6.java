import static java.lang.System.out;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.print("Insert n: ");
        int n = scanner.nextInt();
        int resultFirst = factorialFirst(n);
        out.print("Insert k: ");
        int k = scanner.nextInt();
        int resultSecond = factorialSecond(k);
        int kn = n - k;
        int resultThird = factorialThird(kn);
        int resultMultiplication = resultSecond * resultThird;
        int resultFinal = resultFirst / resultMultiplication;
        out.println("Result: "+resultFinal);
        out.println("Print Pascal Triangle for the given n:");
        printPascalsTriangle(n);
    }
    public static int factorialFirst(int number) {
        if(number == 0) {
            return 1;
        } else {
            return number * factorialFirst(number - 1);
        }
    }
    public static int factorialSecond(int number) {
        if(number == 0) {
            return 1;
        } else {
            return number * factorialSecond(number - 1);
        }
    }
    public static int factorialThird(int number) {
        if(number == 0) {
            return 1;
        } else {
            return number * factorialThird(number - 1);
        }
    }
    //Метод для печати треугольника
    public static void printPascalsTriangle(int n) {
        for(int line = 0; line <= n; line++) {
            int c = 1;
            for(int i = 0; i <= line; i++) {
                out.print(c+" ");
                c = c * (line - i) / (i + 1);
            }
            out.println();
        }
    }
}
