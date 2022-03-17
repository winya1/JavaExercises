import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get("literacy.csv"))
                    // splitting the row into parts on the ";" character
                    .map(row -> row.split(","))
                    // deleting the split rows that have less than two parts (we want the rows to always contain both the name and the birth year)
                    .sorted((row, comparedRow) -> row[5].compareTo(comparedRow[5]))
                    // and finally add the persons to the list
                    .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1].trim() + ", " + row[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
