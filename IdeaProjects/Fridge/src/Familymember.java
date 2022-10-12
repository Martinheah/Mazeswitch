public class Familymember {
String name;
int age;

    public Familymember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Familymember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


