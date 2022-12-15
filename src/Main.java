public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars [0] = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        cars [1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        cars [2] = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        cars [3] = new Car("Kia", "Sportage 4th", 2.4, "rad", 2018, "South Korea");
        cars [4] = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");

        CarService.printCars(cars);
    }
}