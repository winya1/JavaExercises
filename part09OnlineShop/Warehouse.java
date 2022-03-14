import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stockList;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stockList = new HashMap<>();

    }

    public void addProduct(String product, int price, int stock) {

        prices.put(product, price);
        stockList.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);

    }

    public int stock(String product) {
        return stockList.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.stock(product) > 0) {  
            stockList.put(product, stockList.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products() {
        return prices.keySet();
    }
}
