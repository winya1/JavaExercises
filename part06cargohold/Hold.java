import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    private int quantity;
    private int totalWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
        this.quantity = 0;
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= maxWeight) {
            this.quantity++;
            this.hold.add(suitcase);
            this.totalWeight = this.totalWeight + suitcase.totalWeight();
        }
    }

    public String toString() {
        return this.quantity + " suitcases (" + this.totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase items : hold) {
            items.printItems();
            }
    }
}
