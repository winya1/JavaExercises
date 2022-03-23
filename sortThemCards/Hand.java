import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        Iterator<Card> iterator = hand.iterator();
        while (iterator.hasNext()) {
            Card nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand2) {
        int thisSum = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a,b) -> a + b);
        int otherSum = hand2.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a,b) -> a + b);
        return thisSum - otherSum;

    }
}
