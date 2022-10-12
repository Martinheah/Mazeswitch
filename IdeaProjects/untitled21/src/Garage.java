public class Garage {
    public static void main(String[] args) {


        int totalParkingSpots = 50;
        int totalCarsInTheGarage = 40;
        // 20 bilar lämnar garaget
        totalCarsInTheGarage -= 20;
        System.out.println(" Nu är det totalt" + totalCarsInTheGarage+ " i Garaget");
        // 3 bilar kommer in till garaget
        totalCarsInTheGarage += 3;
        // 5 bilar lämnar garaget
        totalCarsInTheGarage -= 5;
        // 4 bilar kommer in till garaget
        totalCarsInTheGarage += 4;
        // 20 bilar kommer in till garaget
        totalCarsInTheGarage += 20;
        // 9 bilar kommer in till garaget
        totalCarsInTheGarage += 9;

    }
}
