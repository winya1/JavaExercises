import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int quantity;
    private int sum;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.quantity = 0;
        this.sum = 0;
        this.maxWeight = maxWeight;
    }


    public void addItem(Item item) {
        if (sum + item.getWeight() <= this.maxWeight) {
            sum = sum + item.getWeight();
            this.items.add(item);
            this.quantity++;

    }
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        return this.quantity + " items" + " (" + this.sum + " kg)";
    }

    public void printItems() {
        for (Item item:items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return sum;
    }

    public Item heaviestItem() {
        int heaviestWeight = 0;
        Item heaviestItem = items.get(0);
        for (Item item:items) {
            if (item.getWeight() > heaviestWeight) {
                heaviestWeight = item.getWeight();
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    }
