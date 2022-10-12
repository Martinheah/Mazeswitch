import java.util.Scanner;

public class Fridge {
    private Item milk;
    private Item yoghurt;
    private Familymember olderBrother;
    public Fridge() {
        milk = new Item(false, "milk", 1);
        yoghurt = new Item(false, "yoghurt", 2);
        olderBrother = new Familymember("Martin", 26);
    }

    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        Scanner scan = new Scanner(System.in);
        int amount = Integer.parseInt(scan.nextLine());
        String a = scan.nextLine();
        String item = scan.nextLine();
        if (item.equals("milk")) {
            if (a.equals("add")) {
                fridge.milk.add(amount);
            } else if (a.equals("remove")) {
                fridge.milk.remove(amount);
            }
        } else if(item.equals("yoghurt")) {
            fridge.yoghurt.remove(amount);

        }

        fridge.printFridgeStatus();
        fridge.yoghurt.remove(1);
        System.out.println(fridge.olderBrother.name);
        System.out.println("Takes out 1 yoghurt");
        fridge.printFridgeStatus();
        fridge.milk.add(1);
        fridge.printFridgeStatus();

       /* Item milk = new Item();
        milk.type = "milk";
        milk.amount = 1;
        milk.expired = false;

        Item yoghurt = new Item();
        yoghurt.type = "yoghurt";
        yoghurt.amount = 2;
        yoghurt.expired = false;

        Item eggs = new Item();
        eggs.type = "eggs";
        eggs.amount = 20;
        eggs.expired = false;

        Item juice = new Item();
        juice.type = "juice";
        juice.amount = 1;
        juice.expired = true;

        Item leftOverRice = new Item();
        leftOverRice.type = "rice";
        leftOverRice.amount = 1;
        leftOverRice.expired = false;

        Item vegetables = new Item();
        vegetables.type = "vegetables";
        vegetables.amount = 4;
        vegetables.expired = false;

        Familymember dad = new Familymember();
        dad.name = "Soo Peng";
        dad.age = 49;
        Familymember mom = new Familymember();
        mom.name = "Sussie";
        mom.age = 47;
        Familymember olderBrother = new Familymember();
        olderBrother.name = "Martin";
        olderBrother.age = 26;
        Familymember littleBrother = new Familymember();
        littleBrother.name = "Calvin";
        littleBrother.age = 23;
        Familymember littleSister = new Familymember();
        littleSister.name = "Celine";
        littleSister.age = 18;


        milk.amount -= 1;
        System.out.println(mom.name
        + FamilyMemberTakingFromFridge()
        + " 1 milk "
        + milk.type
        + totalOf()
        + milk.amount

        */

    }
    public void printFridgeStatus() {

        System.out.println(milk);
        System.out.println(yoghurt);

    }

    public static String FamilyMemberTakingFromFridge() {
        return " has taken ";
    }

    public static String totalOf() {
        return " there is now a total of ";
    }

    public static int addItem(int a, int b) {
        return a + b;
    }

    public static int subtractItem(int a, int b) {
        return a - b;
    }
}





