public abstract class Figure {
    protected String color;
    
    protected double area;
    
    protected double volume;
    
    protected String name;
    
    protected Figure() {}
    
    public double getArea() {
        return area;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public void setColor (String color) {
        this.color = color;
    }
    
    protected abstract double findArea();
    
    protected abstract double findVolume();
    
    public String toString() {
        return String.format(
            "\t\nФигура - %s\n\tЦвет - %s\n\tПлощадь - %.2f\n\tОбъем - %.2f",
            this.name, color, area, volume
        );
    }
}
