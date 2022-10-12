public class Grape extends Fruit{
private int numberOfGrapes;

    public void eatGrapes(int x) {
        numberOfGrapes -= x;
    }

    public Grape(int numberOfGrapes) {
        this.numberOfGrapes = numberOfGrapes;
    }

    public int getNumberOfGrapes() {
        return numberOfGrapes;
    }
}
