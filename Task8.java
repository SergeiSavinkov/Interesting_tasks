import static java.lang.System.out;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.print("String: ");
        String word = scanner.nextLine();
        String reversedWord = new StringBuilder(word).reverse().toString();
        out.print("Result is: ");
        for(int i = 0; i < reversedWord.length(); i++) {
            if(i % 2 == 0) {
                out.print(reversedWord.charAt(i));
            } else {
                out.print(" ");
            }
        }
    }
}
