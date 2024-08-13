
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {

        if (compared.squares > squares) {
            return false;
        } else {
            return true;
        }
    }

    public int priceDifference(Apartment compared) {
        if (compared.princePerSquare * compared.squares > princePerSquare * squares) {
            return compared.princePerSquare * compared.squares - princePerSquare * squares;
        } else {
            return princePerSquare * squares - compared.princePerSquare * compared.squares;
        }

    }

}
