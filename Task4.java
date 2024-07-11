import java.util.Scanner;
import static java.lang.System.out;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.print("First name:");
        String name = scanner.nextLine();
        out.print("Last name:");
        String surname = scanner.nextLine();

        //Вывод имени
        for(int i = 0; i < name.length(); i++) {
            for(int j = 0; j < i; j++) {
                out.print(" ");
            }
            out.println(name.charAt(i));
        }

        //Вывод фамилии
        for(int i = 0; i < surname.length(); i++) {
            for(int j = 0; j < i; j++) {
                out.print(" ");
            }
            out.println(surname.charAt(i));
        }
    }
}
