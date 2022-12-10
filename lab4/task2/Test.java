public class Test {
    /*
     * Задание 9
     * Базовый класс – мебель. Производные – диван и шкаф. 
     * Создать класс Комната, который может содержать оба вида объектов. 
     * Предусмотреть метод подсчета отдельно диванов и шкафов 
     * (использовать оператор instanceof). 
     */

    public static void main(String[] args) {
        Sofa sofa = new Sofa("sofa", "brown", 5);
        
        Cupboard cupboard = new Cupboard("cupboard", "white", 2);
        
        Room room = new Room();
        
        room.addFurniture(cupboard);
        room.addFurniture(sofa);

        System.out.printf("sofas in room: %s\n", room.countSofas());

        System.out.printf("cupboards in room: %s\n", room.countCupboard());
    }
}
