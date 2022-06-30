import java.util.Scanner;

public class JokesInterface {
    private Scanner scanner;
    private JokeManager jokes;

    public JokesInterface(JokeManager jokes, Scanner scanner) {
        this.scanner = scanner;
        this.jokes = jokes;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();

            if(command.equals("X")) {
                break;
            }

            if (Integer.valueOf(command) == 1) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokes.addJoke(joke);
            }

            if (Integer.valueOf(command) == 2) {
                this.jokes.drawJokes();
            }

            if (Integer.valueOf(command) == 3) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            }
        }
    }
}
