/* Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces and prints the last part of the string.

Sample output
one two three four
four
this is a very important message
message */

public class LastWords {
public static void main(String[] args) {

        boolean start = true;

        while (start) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give me a line!");
            String input = scanner.nextLine();

            if (input.equals("")) {
                start = false;
                break;
            }
            String[] fragments = input.split(" ");
            if (!input.equals("")) {
                System.out.println(fragments[fragments.length - 1]);
                System.out.println("Number of parts: " + fragments.length);
                    }
                }
            }

        }
}
