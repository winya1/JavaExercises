/* Write a program that reads names and birth years from the user until an empty line is entered. The name and birth year are separated by a comma.

After that the program prints the longest name and the average of the birth years. If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.

Sample output
sebastian,2017
lucas,2017
lily,2017
hanna,2014
gabriel,2009

Longest name: sebastian
Average of the birth years: 2014.8 */

public class PersonalDetails {
  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalYears = 0;
        int count = 0;
        String longest = "";
        int longestChar = 0;


        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            int length = data[0].length();
            int individualYear = Integer.valueOf(data[1]);
            if (length > longestChar) {
                longestChar = length;
                longest = data[0];
            }
            totalYears = totalYears + individualYear;
            count = count + 1;

        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (double)totalYears / count);
        }
    }
}
