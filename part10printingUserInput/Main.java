import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Input items to print, type enter to stop.");

        while (true) {
            String row = scanner.nextLine();
            if (row.isEmpty()) {
                break;
            }

            inputs.add(row);
        }

        inputs.stream()
                .forEach(name -> System.out.println(name));

    }

}
