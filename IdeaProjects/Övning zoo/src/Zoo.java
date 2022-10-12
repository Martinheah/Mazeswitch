public class Zoo {

    public static void main(String[] args) {
	Animal monkey = new Animal();
        Animal name2 = new Animal();
    monkey.setAge(5);
    monkey.setType("Monkey");
    monkey.setAmountOfLegs(2);
    monkey.setName("Jenny");


    Animal dragon = new Animal();
    dragon.setAge(10);
    dragon.setType("Dragon");
    dragon.setAmountOfLegs(0);
    dragon.setName("Martin");



    Animal alligator = new Animal();
    alligator.setAge(7);
    alligator.setType("Alligator");
    alligator.setAmountOfLegs(4);
    alligator.setName("Crooc");



    Animal bird = new Animal();
    bird.setAge(1);
    bird.setType("Bird");
    bird.setAmountOfLegs(2);
    bird.setName("Papegoja");

        System.out.println("-----------------------------");

        Person person1 = new Person();
        person1.age = 25;
        person1.name = "Kalle";
        person1.sex = "Male";
        person1.role = "zookeeper";
        System.out.println(person1);

        Person person2 = new Person();
        person2.age = 30;
        person2.name = "Lilly";
        person2.sex = "Female";
        person2.role = "Animalfeeder";
        System.out.println(person2);

        Person person3 = new Person();
        person3.age = 26;
        person3.name = "Martin";
        person3.sex = "Male";
        person3.role = "cagecleaner";
        System.out.println(person3);

        Person person4 = new Person();
        person4.age = 19;
        person4.name = "Kevin";
        person4.sex = "Male";
        person4.role = "administrator";
        System.out.println(person4);

        Animal space = new Animal();
        space.setSpace(" ");




        System.out.println(monkey.getName() + monkey.getAge() + monkey.getType() + monkey.getAmountOfLegs());
        System.out.println(bird.getName() + bird.getAge() + bird.getType() + bird.getAmountOfLegs());
        System.out.println(alligator.getName() + alligator.getAge() + alligator.getType() + dragon.getAmountOfLegs());
        System.out.println(dragon.getName() + space.getSpace() + dragon.getAge() + space.getSpace() +
                space.getSpace() + dragon.getType() + space.getSpace() + dragon.getAmountOfLegs());





    }
}
