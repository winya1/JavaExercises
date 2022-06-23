/* Part 1: Printing stars and spaces
Define a method called printSpaces(int number) that produces the number of spaces specified by number. The method does not print the line break.

You will also have to either copy the printStars method from your previous exercise or reimplement it in this exercise template.

Part 2: Printing a right-leaning triangle
Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle. 

Part 3: Printing a Christmas tree
Define a method called christmasTree(int height) that prints the correct Christmas tree. The Christmas tree consists of a triangle with the specified height as well as the base. The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. The tree is to be constructed by using the methods printSpaces and printStars. */

public class AdvancedAstrology {

    public static void main(String[] args) {
       christmasTree(4);
    }

   public static void printSpaces(int number) {
        int start = 1;
        while (start <= number) {
            System.out.print(" ");
            start++;
        }
    }

    public static void printStars(int number) {
        int start = 1;
        while (start <= number) {
            System.out.print("*");
            start++;
        }
        System.out.println("");
    }
    
        public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = height - 1;
        while (i <= height * 2 && j >= 0) {
            printSpaces(j); //printSpaces(3); printSpaces(2)
            printStars(i); // printStars(1); printStars(3);
            i = i + 2; // i = 3
            j--; // j = 2
            if (j == -1) {
                printSpaces(height - 2);
                System.out.println("***");
                printSpaces(height - 2);
                System.out.println("***");
            }
        }
    }
}
