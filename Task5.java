import java.util.Scanner;
import static java.lang.System.out;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();
        int greatest;
        int lowest;
        if (firstNumber == secondNumber) {
            out.println("Both numbers are equal: " + firstNumber);
            greatest = firstNumber;
            lowest = secondNumber;
        } else if (firstNumber > secondNumber) {
            greatest = firstNumber;
            lowest = secondNumber;
        } else {
            greatest = secondNumber;
            lowest = firstNumber;
        }
        if (firstNumber != secondNumber) {
            out.println("The greater number is: " + greatest);
        }
        int sum = firstNumber + secondNumber;
        double result = (double) sum / 2;
        out.println("The Arithmetic mean is (" + greatest + "+" + lowest + ")/2=" + result);
        scanner.close();
    }
}
