public class Message {
    String table[] = {
                "You only need 1 table to fit all of u, follow me",
                "You need 2 tables to fit all of u, follow me",
                "You need 3 tables to fit all of u, follow me",
                "You need 4 tables to fit all of u, follow me",
                "You need 5 tables to fit all of u, follow me"};




    public void welcome() {
        System.out.println("Welcome to the Diner");
    }
    public void notEnoughCapacity() {
        System.out.println("We dont have enough seats to cover your entire company");
    }
    public void numberOfPeople() {
        System.out.println("How many people would like to book for?");
    }
}
