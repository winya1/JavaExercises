import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);

        TextUI ui = new TextUI(flightControl, scanner);
    }
}
