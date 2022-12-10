public class Cupboard extends Furniture {
    int height;

    public Cupboard() {
        super();
        height = 1;
    }

    public Cupboard(String cupName, String cupColor, int cupHeight) {
        super(cupName, cupColor);
        height = cupHeight;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }
}
