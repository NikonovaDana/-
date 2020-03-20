public class testGarage {
    public static void main(String[] args) {
        GarageCar myGarage = new GarageCar(); //создаем новый гараж

        Car myCar1=new Car("Ford", 200, "A111AA", "Mustang",2,false); //создаем легковую машину

        myGarage.addCar(myCar1); // добавляем ее в гараж

        myGarage.addCar(new Car("LADA", 140,"A222AA", "Kalina", 4, false));//добавляем еще одну машину

        Truck myTruck=new Truck("Dove",160,"A333AA","DTS",700,true);//создаем грузовик

        myGarage.addCar(myTruck); //добавляем его в гараж

        myGarage.printGarage(); //выводи на экран содержимое гаража

        if (myGarage.findCar(myCar1)) { //ищем машину
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }

        System.out.println();
        System.out.println("Гараж после удаления первой машины");
        myGarage.removeCar(myCar1);
        myGarage.printGarage();
    }
}