public Age {  

public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int number = 0;

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            for (int i = 0; i < parts.length; i++) {
                int age = Integer.valueOf(parts[1]);
                if (number < age) {
                    number = age;
                }
            }
        }

        System.out.println(number);
    }
}
}
