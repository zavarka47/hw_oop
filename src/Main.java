import lesson_4.transport.Driver.*;
import lesson_4.transport.Exceptions.LicenseExceptions;
import lesson_4.transport.Transport.*;

public class Main {
    public static void main(String[] args) {

/*
        //Car
        Car.Key autoKey = new Car.Key("autoKey", true, true);
        Car.Key autoKeyWithoutStart = new Car.Key("auto Key Without Start", false, true);
        Car.Key autoKeyWithoutAccess = new Car.Key("autoKeyWithoutAccess", true, false);
        Car.Key manualKey = new Car.Key("manualKey", false, false);
        Car[] cars = new Car[5];
        cars [0] = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "manual1", BodyType.COUPE, "x297be",5,"summer", manualKey );
        cars [1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", "auto", BodyType.SEDAN, "c379mo",5,"winter", autoKeyWithoutStart);
        cars [2] = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany","manual", BodyType.ROADSTER, "c904ht", 2, "summer", manualKey);
        cars [3] = new Car("Kia", "Sportage 4th", 2.4, "rad", 2018, "South Korea", "manual", BodyType.CROSSOVER, "h018xy", 5, "demi-season", autoKeyWithoutAccess);
        cars [4] = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", "auto", BodyType.HATCHBACK, "m250ee", 5, "winter", autoKey);
        //Bus
        Bus[] buses = new Bus[3];
        buses[0] = new Bus("LIAZ", "677", 1963, "Russia", "yellow", 70);
        buses[1] = new Bus("PAZ", "2305", 1989, "Russia", "white", 110);
        buses[2] = new Bus("KaVZ", "3976", 1989, "Russia", "grin", 90);


        TransportService.printAddInfoCar(cars);*/



        Car[] cars = new Car[4];
        cars [0] = new Car("Lada", "Granta", 1.7, BodyType.COUPE);
        cars [1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, BodyType.SEDAN);
        cars [2] = new Car("BMW", "Z8", 3.0, BodyType.ROADSTER);
        cars [3] = new Car("Kia", "Sportage 4th", 2.4, BodyType.CROSSOVER);

        Bus[] buses = new Bus[4];
        buses [0] = new Bus("LIAZ", "677", 7.0, BusCapacity.BIG);
        buses [1] = new Bus("PAZ", "2305", 4.2, BusCapacity.SMALL );
        buses [2] = new Bus("KaVZ", "3976", 3.5, BusCapacity.MIDDLE );
        buses [3] = new Bus("MAZ", "103", 7.7, BusCapacity.SMALL);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("KamAZ", "5320", 11.7, LoadCapacity.N2);
        trucks[1] = new Truck("MAN", "TGX", 12.3, LoadCapacity.N3);
        trucks[2] = new Truck("MAZ", "5551", 11.2, LoadCapacity.N2);
        trucks[3] = new Truck("Volvo", "FMX", 10.8, LoadCapacity.N3);

/*        TransportService.printCarWithEnum(cars);
        cars[0].printTyp();
        TransportService.printBusWithEnum(buses);
        buses[0].printTyp();
        TransportService.printTruckWithEnum(trucks);
        trucks[0].printTyp();*/

/*        System.out.println("Cars:");
        TransportService.printBaseInfoTransport(cars);
        System.out.println("Buses:");
        TransportService.printBaseInfoTransport(buses);
        System.out.println("Trucks:");
        TransportService.printBaseInfoTransport(trucks);*/


        System.out.println();
        DriverB <Car> driver1 = new DriverB<>("Чернов Артём Артёмович", null, 3);
        DriverC <Truck> driver2 = new DriverC<>("Черных Ева Дмитриевна", "C", 5);
        DriverD <Bus> driver3 = new DriverD<>("Аникин Арсений Николаевич", "D", 8);

        checkDriver(driver1, driver2, driver3);
        /*driver1.driving(cars[0]);
        driver3.driving(buses[1]);
        driver2.driving(trucks[3]);
        */


    }
    public static void checkDriver (Driver... drivers ){
        for (Driver driver: drivers) {
            try {
                Driver.checkLicense(driver);
            } catch (LicenseExceptions e){
                System.out.println("Driver " + driver.getFullName() + " have a problem with license");
                System.out.println(e.getMessage());
            }

        }
    }


}