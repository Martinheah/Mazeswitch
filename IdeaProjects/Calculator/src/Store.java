public class Store {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Item book = new Item();
        book.priceOfItem = 45;
        book.type = "book";
        book.amountLeft = 20;
        Item milk = new Item();
        milk.amountLeft = 15;
        milk.type = "milk";
        milk.priceOfItem = 25;
        Item glass = new Item();
        glass.type = "glass";
        glass.priceOfItem = 19;
        glass.amountLeft = 15;
        Item butter = new Item();
        butter.amountLeft = 50;
        butter.priceOfItem = 6;
        butter.type = "butter";
        Item coke = new Item();
        coke.type = "coke";
        coke.priceOfItem = 20;
        coke.amountLeft = 33;


        employee1.name = "Lilly";
        employee1.role = "Manager";
        employee1.workingAtm = true;
        employee1.age = 25;
        employee1.id = 503;

        Employee employee2 = new Employee();
        employee2.name = "Martin";
        employee2.role = "CEO";
        employee2.workingAtm = true;
        employee2.age = 25;
        employee2.id = 502;

        Employee employee3 = new Employee();
        employee3.name = "Kim";
        employee3.role = "Cleaner";
        employee3.workingAtm = true;
        employee3.age = 25;
        employee3.id = 501;

        Employee employee4 = new Employee();
        employee4.name = "Simon";
        employee4.role = "COO";
        employee4.workingAtm = false;
        employee4.age = 27;
        employee4.id = 504;



        System.out.println(Welcome());
        System.out.println(WorkingAtm());
        System.out.println(employee1.name + " " + employee1.role);
        System.out.println(employee2.name + " " + employee2.role);
        System.out.println(employee3.name + " " + employee3.role);
        System.out.println(employee4.name + " " + employee4.role);
        System.out.println("The things we have today is "
                + coke.amountLeft + " " + coke.type
                + " " + book.amountLeft + " " + book.type
                + " " + butter.amountLeft + " " + butter.type
                + " " + glass.amountLeft + " " + glass.type
                + " " + milk.amountLeft + " " + milk.type);

        System.out.println(PurchasesByCustomer() + " 5 milk and 5 butter");

        milk.amountLeft -= 5;
        butter.amountLeft -= 5;

        System.out.println(TotalAmountAfterPurchase()
                + milk.amountLeft + " " +  milk.type + " left and "
                + butter.amountLeft + " " + butter.type);

        System.out.println(PurchasesByCustomer() + " 10 coke and 10 milk");

        coke.amountLeft -= 10;
        milk.amountLeft -= 10;

        System.out.println(TotalAmountAfterPurchase()
                + coke.amountLeft + " " + coke.type + " "
                + milk.amountLeft + " " + milk.type);

        System.out.println(PurchasesByCustomer() + " 15 books and 8 glass");

        book.amountLeft -= 15;
        glass.amountLeft -= 8;

        System.out.println(TotalAmountAfterPurchase()
                + book.amountLeft + " " + book.type + " "
                + glass.amountLeft + " " + glass.type);

    }

    public static String Welcome() {
        return "Welcome back to the store dear customer";
    }
    public static String WorkingAtm() {
        return "The people working today and their names and roles are";
    }
    public static String TotalAmountAfterPurchase() {
        return "There is now a total of ";
    }
    public static String PurchasesByCustomer() {
        return "Customer purchases ";
    }
}
