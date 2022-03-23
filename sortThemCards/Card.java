public class Card implements Comparable<Card>{
    private int value;
    private Suit suit;
    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String card = "" + this.value;
        if (this.value == 11) {
            card = "J";
        } if (this.value == 12) {
            card = "Q";
        } if (this.value == 13) {
            card = "K";
        } if (this.value == 14) {
            card = "A";
        }

        return this.suit + " " + card;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card object) {
        int value = this.getValue() - object.getValue();
        if (value == 0) {
            return 0;
        }
        return value;
    }
    }
