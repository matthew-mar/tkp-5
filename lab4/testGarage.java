public class testGarage {
    public static void main(String[] args) {
        GarageCar myGarage=new GarageCar(); //создаем новый гараж
        Car myCar1=new Car("Ford", 200,"Mustang", "a777aa", 2,false); //создаем легковую машину
        myGarage.addCar(myCar1); // добавляем ее в гараж
        myGarage.addCar(new Car("LADA", 140, "Kalina", "к000кк", 4, false));//добавляем еще одну машину
        Truck myTruck=new Truck("Dove",160,"DTS", "п111пп", 700,true);//создаем грузовик myGarage.addCar(myTruck); //добавляем его в гараж
        myGarage.addCar(myTruck);
        myGarage.printGarage(); //выводи на экран содержимое гаража
        if (myGarage.findCar(myCar1)) { //ищем машину
            System.out.println("Да"); 
        } else {
            System.out.println("Нет");
        }
        if (myGarage.deleteCar(myTruck)) {
            System.out.println("car deleted");
        } else {
            System.out.println("failed delete car");
        }
    }
} 