public class WolfTest {
    public static void main(String[] args) {
        Wolf reks = new Wolf();
        reks.name = "Рекс";
        reks.gender = "Самец";
        reks.color = "Серый";
        reks.age = 5;
        reks.weight = 40;
        System.out.println(" Создан новый волк! \n Кличка:" + reks.name + "\n Пол:" + reks.gender +
                "\n Окрас:" +  reks.color + "\n Возраст:" + reks.color + "\n Вес:" + reks.color );
        reks.go();
        reks.sit();
        reks.run();
        reks.hunt();
        reks.howl();
    }
}