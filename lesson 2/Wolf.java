public class Wolf {

    private String name;
    private String gender;
    private String color;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println(" Внимание! Некорректный возраст \n");
        } else {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void go() {
        System.out.println(" Волк идет");
    }

    public void sit() {
        System.out.println(" Волк сидит");
    }

    public void run() {
        System.out.println(" Волк бежит");
    }

    public void hunt() {
        System.out.println(" Волк охотится");
    }

    public void howl() {
        System.out.println(" Волк воет");
    }
}