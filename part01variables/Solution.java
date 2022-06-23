/*Write a program that asks the user for a string, an integer, a floating-point number, and a boolean. The program should then print the values given by the user.

Example prints for the program can be seen below.
*/
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String text = scanner.nextLine();
        System.out.println("Give an integer: ");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        double floatingPoint = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
