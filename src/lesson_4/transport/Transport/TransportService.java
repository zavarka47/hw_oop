package lesson_4.transport.Transport;

import java.time.LocalDate;

public class TransportService {
    // Transport
    public static void printBaseInfoTransport (transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            System.out.print("brand: " + addSpaceBrand(transports[i].getBrand(), transports) +
                    "; model: " + addSpaceModel(transports[i].getModel(), transports) +
                    "; engineVolume: " + transports[i].getEngineVolume()+ "   ");
            transports[i].pitStop();
            transports[i].bestTimeCircle();
            transports[i].maxSped();
            System.out.println();

        }
    }
    private static int maxLengthBrand(transport[] transports) {
        int maxLengthBrand = transports[0].getBrand().length();
        for (int i = 0; i < transports.length; i++) {
            if (maxLengthBrand < transports[i].getBrand().length()) {
                maxLengthBrand = transports[i].getBrand().length();
            }
        }
        return maxLengthBrand;
    }
    private static int maxLengthModel(transport[] transports) {
        int maxLengthModel = transports[0].getModel().length();
        for (int i = 0; i < transports.length; i++) {
            if (maxLengthModel < transports[i].getModel().length()) {
                maxLengthModel = transports[i].getModel().length();
            }
        }
        return maxLengthModel;
    }
    private static String addSpaceBrand(String brand, transport[] transports) {
        int max = maxLengthBrand(transports);
        String fullBrand = brand;
        if (brand.length() < max) {
            for (int i = 0; i < (max - brand.length()); i++) {
                fullBrand = fullBrand + ".";
            }
        }
        return fullBrand + "...";
    }
    private static String addSpaceModel(String model, transport[] transports) {
        int max = maxLengthModel(transports);
        String fullModel = model;
        if (model.length() < max) {
            for (int i = 0; i < (max - model.length()); i++) {
                fullModel = fullModel + ".";
            }
        }
        return fullModel + "...";
    }


    // Car
    public static void printBaseInfoCar (Car [] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("brand: " + addSpaceBrand(cars[i].getBrand(), cars) +
                    "; model: " + addSpaceModel(cars[i].getModel(), cars) +
                    "; engineVolume: " + cars[i].getEngineVolume()+
                    "; color: " + addSpaceColorCar(cars[i].getColor(), cars) +
                    "; year: " + cars[i].getYear() +
                    "; country: " + addSpaceCountryCar(cars[i].getCountry(), cars));
            }
    }
    private static int maxLengthColorCar(Car[] cars) {
        int maxLengthColor = cars[0].getColor().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthColor < cars[i].getColor().length()) {
                maxLengthColor = cars[i].getColor().length();
            }
        }

        return maxLengthColor;
    }
    private static int maxLengthCountryCar(Car[] cars) {
        int maxLengthCountry = cars[0].getCountry().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthCountry < cars[i].getCountry().length()) {
                maxLengthCountry = cars[i].getCountry().length();
            }
        }
        return maxLengthCountry;
    }
    private static String addSpaceColorCar(String color, Car[] cars) {
        int max = maxLengthColorCar(cars);
        String fullColor = color;
        if (color.length() < max) {
            for (int i = 0; i < (max - color.length()); i++) {
                fullColor = fullColor + ".";
            }
        }
        return fullColor + "...";
    }
    private static String addSpaceCountryCar(String country, Car[] cars) {
        int max = maxLengthCountryCar(cars);
        String fullCountry = country;
        if (country.length() < max) {
            for (int i = 0; i < (max - country.length()); i++) {
                fullCountry = fullCountry + ".";
            }
        }
        return fullCountry + "...";
    }

    //Car AddInfo
    public static void printAddInfoCar (Car [] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("brand: " + addSpaceBrand(cars[i].getBrand(), cars) +
                    "; model: " + addSpaceModel(cars[i].getModel(), cars) +
                            "transmission: " + addSpaceTransmission(cars[i].getTransmission(), cars) +
                            "; body type: " + addSpaceBodyType(cars[i].getBodyType().getBodyType(), cars) +
                            "; registration No.: " + cars[i].getRegistrationNo() +
                            "; quantity of seats: " + cars[i].getQuantityOfSeats() +
                            "; rubber: " + addSpaceRubber(cars[i].getRubber(), cars));
        }
    }
    private static int maxLengthTransmission(Car[] cars) {
        int maxLengthTransmission = cars[0].getTransmission().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthTransmission < cars[i].getTransmission().length()) {
                maxLengthTransmission = cars[i].getTransmission().length();
            }
        }
        return maxLengthTransmission;
    }
     private static int maxLengthBodyType(Car[] cars) {
        int maxLengthBodyType = cars[0].getBodyType().getBodyType().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthBodyType < cars[i].getBodyType().getBodyType().length()) {
                maxLengthBodyType = cars[i].getBodyType().getBodyType().length();
            }
        }
        return maxLengthBodyType;
    }
    private static int maxLengthRubber(Car[] cars) {
        int maxLengthRubber = cars[0].getRubber().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthRubber < cars[i].getRubber().length()) {
                maxLengthRubber = cars[i].getRubber().length();
            }
        }
        return maxLengthRubber;
    }
    private static String addSpaceTransmission(String transmission, Car[] cars) {
        int max = maxLengthTransmission(cars);
        String fullTransmission = transmission;
        if (transmission.length() < max) {
            for (int i = 0; i < (max - transmission.length()); i++) {
                fullTransmission = fullTransmission + ".";
            }
        }
        return fullTransmission + "...";
    }
    private static String addSpaceBodyType(String bodyType, Car[] cars) {
        int max = maxLengthBodyType(cars);
        String fullBodyType = bodyType;
        if (bodyType.length() < max) {
            for (int i = 0; i < (max - bodyType.length()); i++) {
                fullBodyType = fullBodyType + ".";
            }
        }
        return fullBodyType + "...";
    }
    private static String addSpaceRubber(String rubber, Car[] cars) {
        int max = maxLengthRubber(cars);
        String fullRubber = rubber;
        if (rubber.length() < max) {
            for (int i = 0; i < (max - rubber.length()); i++) {
                fullRubber = fullRubber + ".";
            }
        }
        return fullRubber + "...";
    }

    //Car with Enum
    public static void printCarWithEnum (Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("brand: " + addSpaceBrand(cars[i].getBrand(), cars) +
                    "; model: " + addSpaceModel(cars[i].getModel(), cars) +
                    "; engineVolume: " + cars[i].getEngineVolume()+
                    "; body type: " + addSpaceBodyType(cars[i].getBodyType().getBodyType(), cars));
        }
    }


    // Bus
    public static void printBaseInfoBus (Bus [] buses) {
        for (int i = 0; i < buses.length; i++) {
            System.out.println("brand: " + addSpaceBrand(buses[i].getBrand(), buses) +
                    "; model: " + addSpaceModel(buses[i].getModel(), buses) +
                    "; year: " + buses[i].getYear() +
                    "; country: " + addSpaceCountryBus(buses[i].getCountry(), buses) +
                    "; color: " + addSpaceColorBus(buses[i].getColor(), buses) +
                    "; maxSped: " + buses[i].getMaxSped());
            //String brand, String model, int year, String country, String color, int maxSped;
        }
    }
    private static int maxLengthColorBus(Bus[] buses) {
        int maxLengthColor = buses[0].getColor().length();
        for (int i = 0; i < buses.length; i++) {
            if (maxLengthColor < buses[i].getColor().length()) {
                maxLengthColor = buses[i].getColor().length();
            }
        }

        return maxLengthColor;
    }
    private static int maxLengthCountryBus(Bus[] buses) {
        int maxLengthCountry = buses[0].getCountry().length();
        for (int i = 0; i < buses.length; i++) {
            if (maxLengthCountry < buses[i].getCountry().length()) {
                maxLengthCountry = buses[i].getCountry().length();
            }
        }
        return maxLengthCountry;
    }
    private static String addSpaceColorBus(String color, Bus [] buses) {
        int max = maxLengthColorBus(buses);
        String fullColor = color;
        if (color.length() < max) {
            for (int i = 0; i < (max - color.length()); i++) {
                fullColor = fullColor + ".";
            }
        }
        return fullColor + "...";
    }
    private static String addSpaceCountryBus(String country, Bus[] buses) {
        int max = maxLengthCountryBus(buses);
        String fullCountry = country;
        if (country.length() < max) {
            for (int i = 0; i < (max - country.length()); i++) {
                fullCountry = fullCountry + ".";
            }
        }
        return fullCountry + "...";
    }

    //Bus with Enum
    public static void printBusWithEnum (Bus[] buses) {
        for (int i = 0; i < buses.length; i++) {
            System.out.println("brand: " + addSpaceBrand(buses[i].getBrand(), buses) +
                    "; model: " + addSpaceModel(buses[i].getModel(), buses) +
                    "; engineVolume: " + buses[i].getEngineVolume()+
                    "; bus capacity: " + addSpaceBusCapacity(buses[i].getBusCapacity().toString(), buses));
        }
    }
    private static int maxLengthBusCapacity (Bus[]buses) {
        int maxLengthColor = buses[0].getBusCapacity().toString().length();
        for (int i = 0; i < buses.length; i++) {
            if (maxLengthColor < buses[i].getBusCapacity().toString().length()) {
                maxLengthColor = buses[i].getBusCapacity().toString().length();
            }
        }
        return maxLengthColor;
    }
    private static String addSpaceBusCapacity(String busCapacity, Bus[] buses) {
            int max = maxLengthBusCapacity(buses);
            String fullBusCapacity = busCapacity;
            if (busCapacity.length() < max) {
                for (int i = 0; i < (max - busCapacity.length()); i++) {
                    fullBusCapacity = fullBusCapacity + ".";
                }
            }
            return fullBusCapacity + "...";
        }

    //Truck with Enum
    public static void printTruckWithEnum (Truck[] buses) {
        for (int i = 0; i < buses.length; i++) {
            System.out.println("brand: " + addSpaceBrand(buses[i].getBrand(), buses) +
                    "; model: " + addSpaceModel(buses[i].getModel(), buses) +
                    "; engineVolume: " + buses[i].getEngineVolume()+
                    "; load capacity: " + addSpaceLoadCapacity(buses[i].getLoadCapacity().toString(), buses));
        }
    }
    private static int maxLengthLoadCapacity (Truck []trucks) {
        int maxLengthColor = trucks[0].getLoadCapacity().toString().length();
        for (int i = 0; i < trucks.length; i++) {
            if (maxLengthColor < trucks[i].getLoadCapacity().toString().length()) {
                maxLengthColor = trucks[i].getLoadCapacity().toString().length();
            }
        }
        return maxLengthColor;
    }
    private static String addSpaceLoadCapacity (String LoadCapacity, Truck[] trucks) {
        int max = maxLengthLoadCapacity(trucks);
        String fullTruckCapacity = LoadCapacity;
        if (LoadCapacity.length() < max) {
            for (int i = 0; i < (max - LoadCapacity.length()); i++) {
                fullTruckCapacity = fullTruckCapacity + ".";
            }
        }
        return fullTruckCapacity + "...";
    }


    // Логические методы
    public static void changRubber(Car[] cars) {
        int localMouth = LocalDate.now().getMonthValue();
        if (localMouth >= 4 && localMouth <= 10) {
            for (int i = 0; i < cars.length; i++) {
                cars[i].setRubber("Summer");
            }
        } else {
            for (int i = 0; i < cars.length; i++) {
                cars[i].setRubber("Winter");
            }
        }
    }
}

