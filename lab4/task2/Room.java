import java.util.ArrayList;

public class Room {
    private ArrayList<Furniture> furnitures = new ArrayList<Furniture>();

    public Room() {}

    public Room(ArrayList<Furniture> furs) {
        furnitures = furs;
    }
    
    public void addFurniture(Furniture furniture) {
        furnitures.add(furniture);
    }

    public Boolean isSofa(Furniture furniture) {
        return furniture instanceof Sofa;
    }

    public Boolean isCupboard(Furniture furniture) {
        return furniture instanceof Cupboard;
    }

    public int countSofas() {
        int counter = 0;
        for (Furniture furniture: furnitures) {
            if (isSofa(furniture)) {
                counter++;
            }
        }
        return counter;
    }

    public int countCupboard() {
        int counter = 0;
        for (Furniture furniture: furnitures) {
            if (isCupboard(furniture)) {
                counter++;
            }
        }
        return counter;
    }
}
