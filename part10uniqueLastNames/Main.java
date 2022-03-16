import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> inputs = new ArrayList<>();

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String row = scanner.nextLine();
            if (row.equals("quit")) {
                break;
            }
            System.out.print("Input first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Input last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Input the year of birth: ");
            int birthYear = Integer.parseInt(scanner.nextLine());



            inputs.add(new Person(firstName, lastName, birthYear));

        }

        System.out.println("Unique last names in alphabetical order:");

        inputs.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));

    }

}
