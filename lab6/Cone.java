public class Cone extends Figure implements ICone {
    protected final double pi = 3.14;
    
    protected double radius;
    
    protected double height;
    
    public Cone(String color, double radius, double height) {
        this.name = "Cone";
        this.color = color;
        this.radius = radius;
        this.height = height;
        
        area = findArea();
        volume = findVolume();
    }
    
    @Override
    protected double findArea() {
        return pi * radius * (radius + Math.sqrt(radius*radius + height*height));
    }
    
    @Override
    protected double findVolume() {
        return ((double)1 / (double)3) * pi * radius * radius * height;
    }
    
    @Override
    public double getRadius() {
        return radius;
    }
    
    @Override
    public double getHeight() {
        return height;
    }
    
    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void setHeight(double height) {
        this.height = height;
    }
}
