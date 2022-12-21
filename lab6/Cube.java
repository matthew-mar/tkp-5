public class Cube extends Figure implements ICube {
    protected double side;
    
    public Cube(String color, double side) {
        this.name = "Cube";
        this.color = color;
        this.side = side;
        
        area = findArea();
        volume = findVolume();
    }
    
    @Override
    protected double findArea() {
        return 6 * side * side;
    }
    
    @Override
    protected double findVolume() {
        return side * side * side;
    }
    
    @Override
    public double getSide() {
        return side;
    }
    
    @Override
    public void setSide(double side) {
        this.side = side;
    }
}
