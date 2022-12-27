import com.sun.jdi.connect.Transport;
import transport.Bus;
import transport.Car;
import transport.CarService;

public class Main {
    public static void main(String[] args) {
        Car.Key autoKey = new Car.Key("autoKey", true, true);
        Car.Key autoKeyWithoutStart = new Car.Key("auto Key Without Start", false, true);
        Car.Key autoKeyWithoutAccess = new Car.Key("autoKeyWithoutAccess", true, false);
        Car.Key manualKey = new Car.Key("manualKey", false, false);
        Car[] cars = new Car[5];
        cars [0] = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "manual1", "sedan", "x297be",5,"summer", manualKey );
        cars [1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", "auto", "sedan", "c379mo",5,"winter", autoKeyWithoutStart);
        cars [2] = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany","manual", "roadster", "c904ht", 2, "summer", manualKey);
        cars [3] = new Car("Kia", "Sportage 4th", 2.4, "rad", 2018, "South Korea", "manual", "crossomer", "h018xy", 5, "demi-season", autoKeyWithoutAccess);
        cars [4] = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", "auto", "hatchback", "m250ee", 5, "winter", autoKey);

        CarService.printCars(cars);
        Bus[] buses = new Bus[3];
        buses[0] = new Bus("LIAZ", "677", 1963, "Russia", "yellow", 70);
        buses[1] = new Bus("PAZ", "2305", 1989, "Russia", "white", 110);
        buses[2] = new Bus("KaVZ", "3976", 1989, "Russia", "grin", 90);
        /*for (Bus bus : buses) {
            System.out.println(bus);
        }*/




        //CarService.printCars(cars);
        //CarService.changRubber(cars);
        //CarService.printCars(cars);

    }
}