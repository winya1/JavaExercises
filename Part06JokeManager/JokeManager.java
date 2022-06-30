import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJokes() {
        if (this.jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        }
        Random rand = new Random();
        return this.jokes.get(rand.nextInt(this.jokes.size()));
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }

}
