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
