/* Write a program that reads names and ages from the user until an empty line is entered. The name and age are separed by a comma.

After reading all user input, the program prints the name of the oldest person. You can assume that the user enters at least one person, and the that one of the users is older than the others.

Sample output
sebastian,2
lucas,2
lily,1
hanna,5
gabriel,10

Name of the oldest: gabriel
*/

public class name {

 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            int age = Integer.valueOf(data[1]);
            if (age > oldest) {
                oldest = age;
                name = data[0];
            }
        }

        System.out.println("Name of the oldest: " + name);
        }
    }
}
