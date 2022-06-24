/*Write a program that reads user input until an empty line. 
For each non-empty string, the program splits the string by spaces and
then prints the pieces that contain av, each on a new line. */

public static class AVClub {

public static void main(String[] args) {

        boolean start = true;

        int index = 0;

        while (start) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give me a line!");
            String input = scanner.nextLine();

            if (input.equals("")) {
                start = false;
                break;
            }
            String[] fragments = input.split(" ");
            if (!input.equals("") && index < fragments.length) {
                for (int i = 0; i < fragments.length; i++) {
                    if (fragments[i].contains("av")) {
                        System.out.println(fragments[i]);
                    }
                }
            }

        }
    }
}
