public class testRoom {
    public static void main(String[] args) {
        Room myRoom = new Room(); //создаем новую комнату

        Cupboard myCup1 = new Cupboard("Ikea", 66, 150 , 200 , "Деревянный шкаф для одежды",2,false); //создаем шкаф

        myRoom.addFur(myCup1); // добавляем шкаф в комнату

        myRoom.addFur(new Cupboard("Леруа Мерлен", 100,160 , 70, "ДСП Комод", 4, false));//добавляем еще один шкаф

        Table myTable = new Table("IKEA",58,96,72,"Писменный стол",4,true);//создаем стол

        myRoom.addFur(myTable); //добавляем его в гараж

        myRoom.printRoom(); //выводи на экран содержимое комнаты

        if (myRoom.findFur(myCup1)) { //ищем мебель
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }

        System.out.println();
        System.out.println("Гараж после удаления первого шкафа");
        myRoom.removeFur(myCup1);
        myRoom.printRoom();
    }
}