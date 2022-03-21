import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input: ");
        String title = scanner.nextLine();
        Checker test = new Checker();
        if (test.timeOfDay(title)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

     /*   
     //Vowels Check
     System.out.print("Enter input: ");
        String title = scanner.nextLine();
        Checker test = new Checker();
        if (test.allVowels(title)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        */

        /*    
        
        //Day of Week check
        String title = scanner.nextLine();
            Checker test = new Checker();
            if (test.isDayOfWeek(title)) {
                System.out.println("The form is correct.");
            } else {
                System.out.println("The form is incorrect.");
            }
*/
    }
}
