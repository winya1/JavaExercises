import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        while (true) {
            Integer row = Integer.valueOf(scanner.nextLine());
            if (row < 0) {
                break;
            }

            inputs.add(row);
        }

        inputs.stream()
                .filter(i -> i <= 5)
                .forEach(i -> System.out.println(i));

    }

}
