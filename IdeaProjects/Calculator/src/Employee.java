public class Employee {
    public static void main(String[] args) {

    }

    int id;
    int age;
    String name;
    String role;
    boolean workingAtm;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", workingAtm=" + workingAtm +
                '}';
    }
}




