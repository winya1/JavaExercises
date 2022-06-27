/* After the user has entered the last set of details (they enter an empty first name), exit the repeat statement.

Then print the collected personal information so that each entered object is printed in the following format: first and last names separated by a space (you don't print the identification number). An example of the working program is given below: */


import java.util.ArrayList;
public class Main {

public static void main(String[] args) {
ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.println("Last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Identification number: ");
            String identificationNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        for (PersonalInformation information : infoCollection) {
            System.out.println(information.getFirstName() + " " + information.getLastName());
        }
    }
}
