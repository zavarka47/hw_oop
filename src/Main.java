import lesson_4.transport.*;

public class Main {
    public static void main(String[] args) {

        /*
        Car
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
        Bus
        Bus[] buses = new Bus[3];
        buses[0] = new Bus("LIAZ", "677", 1963, "Russia", "yellow", 70);
        buses[1] = new Bus("PAZ", "2305", 1989, "Russia", "white", 110);
        buses[2] = new Bus("KaVZ", "3976", 1989, "Russia", "grin", 90);*/

        Car[] cars = new Car[4];
        cars [0] = new Car("Lada", "Granta", 1.7);
        cars [1] = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        cars [2] = new Car("BMW", "Z8", 3.0);
        cars [3] = new Car("Kia", "Sportage 4th", 2.4);

        Bus[] buses = new Bus[4];
        buses [0] = new Bus("LIAZ", "677", 7.0);
        buses [1] = new Bus("PAZ", "2305", 4.2 );
        buses [2] = new Bus("KaVZ", "3976", 3.5 );
        buses [3] = new Bus("MAZ", "103", 7.7 );

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("KamAZ", "5320", 11.7);
        trucks[1] = new Truck("MAN", "TGX", 12.3);
        trucks[2] = new Truck("MAZ", "5551", 11.2);
        trucks[3] = new Truck("Volvo", "FMX", 10.8);

        System.out.println("Cars:");
        TransportService.printBaseInfoTransport(cars);
        System.out.println("Buses:");
        TransportService.printBaseInfoTransport(buses);
        System.out.println("Trucks:");
        TransportService.printBaseInfoTransport(trucks);

        System.out.println();
        Driver <Car> categoryB = new Driver<>("Чернов Артём Артёмович", true, 3);
        Driver <Bus> categoryC = new Driver<>("Аникин Арсений Николаевич", true, 8);
        Driver <Truck> categoryD = new Driver<>("Черных Ева Дмитриевна", true, 5);
        categoryB.driving(cars[0]);
        categoryC.driving(buses[1]);
        categoryD.driving(trucks[3]);





    }
}