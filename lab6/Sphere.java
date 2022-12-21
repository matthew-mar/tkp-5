public class Sphere extends Figure implements ISphere {
    protected final double pi = 3.14;
    
    protected double radius;
    
    public Sphere(String color, double radius) {
        this.name = "Sphere";
        this.color = color;
        this.radius = radius;
        
        area = findArea();
        volume = findVolume();
    }
    
    @Override
    protected double findArea() {
        return (double)4 * pi * radius * radius;
    }
    
    @Override
    protected double findVolume() {
        return ((double)4 / (double)3) * pi * radius * radius * radius;
    }
    
    @Override
    public double getRadius() {
        return radius;
    }
    
    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
