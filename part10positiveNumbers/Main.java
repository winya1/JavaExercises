import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            if (Integer.valueOf(row))

            list.add(Integer.valueOf(row));
        }
        System.out.println(positive(list));

    }

    public static List<Integer> positive(List<Integer> numbers) {

        ArrayList<Integer> getPosNumbers = numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        return getPosNumbers;
    }

}
