public class Furniture {
    private String name;

    private String color;

    public Furniture() {
        color = "black";
    }

    public Furniture(String furName, String furColor) {
        name = furName;
        color = furColor;
    }

    public void setName(String furName) {
        name = furName;
    }

    public void setColor(String furColor) {
        color = furColor;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
