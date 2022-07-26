public class WolfTest {
    public static void main(String[] args) {
        Wolf reks = new Wolf();
        reks.setName("Рекс");
        reks.setGender("Самец");
        reks.setColor("Серый");
        reks.setAge(5);
        reks.setWeight(40);
        System.out.println(" Создан новый волк! \n Кличка:" + reks.getName() + "\n Пол:" +
                reks.getGender() + "\n Окрас:" +  reks.getColor() + "\n Возраст:" + reks.getAge() +
                "\n Вес:" + reks.getWeight() + "\n");
        reks.go();
        reks.sit();
        reks.run();
        reks.hunt();
        reks.howl();
    }
}