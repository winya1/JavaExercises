import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    private List<Movable> herdList;
    private int x;
    private int y;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) { 
        this.herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable item : herdList) {
            item.move(dx, dy);
        }

    }

    public String toString() {
        String herdString = "";
        for (Movable item : herdList) {
            herdString +=  item.toString() + "\n";
        }
        return herdString;
    }
}
