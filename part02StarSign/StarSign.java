/* 
Part 1: Printing stars
Define a method called printStars that prints the given number of stars and a line break.

Part 2: Printing a square
Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method

Part 3: Printing a rectangle
Write a method called printRectangle(int width, int height) that prints the correct rectangle by using the printStars method.

Part 4: Printing a triangle
Create a method called printTriangle(int size) that prints a triangle by using the printStars method. */



public class StarSign {

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

   public static void printStars(int number) {
        int start = 1;
        while (start <= number) {
            System.out.print("*");
            start++;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printSquare(int size) {
        int start = 1;
        while (start <= size) {
            printStars(size);
            start++;
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        int start = 1;
        while (start <= height) {
            printStars(width);
            start++;
        }
    }

    public static void printTriangle(int size) {
        int start = 1;
        while (start <= size) {
            printStars(start);
            start++;
        }
    }
}
