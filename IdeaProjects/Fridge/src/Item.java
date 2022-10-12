public class Item {
boolean expired;
String type;
int amount;

    public Item(boolean expired, String type, int amount) {
        this.expired = expired;
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "expired=" + expired +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
    public void remove(int x) {
        amount -= x;

    }
    public void add(int x) {
        amount += x;
    }
}
