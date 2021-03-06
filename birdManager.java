import java.util.*;

public class birdManager {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birdList = new ArrayList<>();


        while (true) {
            System.out.print("? ");
            final String input = scan.nextLine();

            if ("add".equalsIgnoreCase(input)) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                birdList.add(new Bird(name, latinName));
            }

            if ("observation".equalsIgnoreCase(input)) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();
                boolean match = false;
                for (int i = 0; i < birdList.size(); i++) {
                    if (birdList.get(i).getName().equals(bird)) {
                        birdList.get(i).increasedCount();
                        match = true;
                    }
                }
                if (match == false) {
                    System.out.println("Not a bird!");
                }
            }

            if ("one".equalsIgnoreCase(input)) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                for (int i = 0; i < birdList.size(); i++) {
                    if (birdList.get(i).getName().equals(bird)) {
                        System.out.println(birdList.get(i));
                    }
                }
            }

            if ("all".equalsIgnoreCase(input)) {
                for (int i = 0; i < birdList.size(); i++) {
                        System.out.println(birdList.get(i));
                    }
                }

            if ("quit".equalsIgnoreCase(input)) {
                    break;
                }


            }
        }
    }
