public class Fruitbowl{
    private Grape grape;
    private Apple apple;

    public Fruitbowl() {
        grape = new Grape(20);
        apple = new Apple();


    }
    public void eat() {
        grape.eatGrapes(5);
        System.out.println(grape.getNumberOfGrapes() + " Vindruvor" + " 1 äpple");
        grape.eatGrapes(7);

        System.out.println(grape.getNumberOfGrapes() + " Vindruvor" + " 1 äpple");
    }


}
