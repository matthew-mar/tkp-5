public class Sofa extends Furniture {
    private int seats;
    
    public Sofa() {
        super();
        seats = 3;
    }

    public Sofa(String sofaName, String sofaColor, int sofaSeats) {
        super(sofaName, sofaColor);
        seats = sofaSeats;
    }

    public void setSeats(int s) {
        seats = s;
    }

    public int getSeats() {
        return seats;
    }
}
