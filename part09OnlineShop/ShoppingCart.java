import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//good code to look at - Item being used as an object!

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.keySet().contains(product)) {
            increaseQuantity(product);
        } else {
            cart.put(product, new Item(product, 1, price));
        }
    }

    private void increaseQuantity(String product) {
        this.cart.get(product).increaseQuantity();
    }

    public int price() {
        int sum = 0;
        for (Item i : cart.values()) {
            sum += i.price();
        }
        return sum;
    }

    public void print() {
        for (String product : cart.keySet()) {
            System.out.println(cart.get(product).toString());
        }
    }

}
