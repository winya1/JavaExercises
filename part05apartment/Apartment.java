/* Part 1: Comparing sizes
Create a method public boolean largerThan(Apartment compared) that returns true if the apartment object whose method is called has a larger total area than the apartment object that is being compared.

Part 2: Price difference
Create a method public int priceDifference(Apartment compared) that returns the price difference of the apartment object whose method was called and the apartment object received as the parameter. The price difference is the absolute value of the difference of the prices (price can be calculated by multiplying the price per square by the number of squares).

Part 3: More expensive?
Write a method public boolean moreExpensiveThan(Apartment compared) that returns true if the apartment object whose method is called is more expensive than the apartment object being compared.

*/

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        if (this.pricePerSquare * this.squares > compared.pricePerSquare * compared.squares) {
            return this.pricePerSquare * this.squares - compared.pricePerSquare * compared.squares;
        } else {
            return compared.pricePerSquare * compared.squares - this.pricePerSquare * this.squares;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.pricePerSquare * this.squares > compared.pricePerSquare * compared.squares) {
            return true;
        }
        return false;
    }
}
