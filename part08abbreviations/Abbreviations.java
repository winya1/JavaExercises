import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> dictionary;

    public Abbreviations() {
        this.dictionary = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.dictionary.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.dictionary.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        if (this.dictionary.containsKey(abbreviation)) {
            return this.dictionary.get(abbreviation);
        } else {
            return null;
        }
    }

}
