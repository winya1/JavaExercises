import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card c1, Card c2) {

    int suitByOrder = c1.getSuit().ordinal() - c2.getSuit().ordinal();

       if (suitByOrder == 0) {
           return c1.compareTo(c2); // this also works - c1.getValue() - c2.getValue();
       }
       return suitByOrder;
    }

}
