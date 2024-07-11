import static java.lang.System.out;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] array = new int[size];
        out.print("Given numbers are: ");

        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> listFirst = new ArrayList<>();
        for(int num : array) {
            listFirst.add(num);
        }

        // Execute the operation until the list becomes empty
        List<Integer> listSecond = new ArrayList<>();
        while(listFirst.size() > 0) {
            // Calculate the difference between the last and the first element
            int difference = listFirst.get(listFirst.size() - 1) - listFirst.get(0);
            int square = difference * difference;
            listSecond.add(square);

            // Remove the last and first elements from the list
            listFirst.remove(listFirst.size() - 1);
            if(listFirst.size() > 0) {
                listFirst.remove(0);
            }
        }

        // Print the results
        out.print("Result is: ");
        for(int i = 0; i < listSecond.size(); i++) {
            out.print(listSecond.get(i));
            out.print(" ");
        }
    }
}
