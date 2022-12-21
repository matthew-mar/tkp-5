public class Test {
    public static void main(String[] args) {
        Figure Sphere = new Sphere("Белый", 2);
        Figure cube = new Cube("Черный", 4);
        Figure cone = new Cone("Зеленый", 5, 6);
        
        System.out.println(Sphere);
        System.out.println(cone);
        System.out.println(cube);
        System.out.println();
        
        Subclass sub = new Subclass();
        sub.OperationResult(Sphere, cube, "+");
    }
}
