package transport;

import java.time.LocalDate;

public class CarService {

    public static void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("brand: " + addSpaceBrand(cars[i].getBrand(), cars) +
                    "; model: " + addSpaceModel(cars[i].getModel(), cars) +
                    "; engineVolume: " + cars[i].getEngineVolume() +
                    "; color: " + addSpaceColor(cars[i].getColor(), cars) +
                    "; year: " + cars[i].getYear() +
                    "; country: " + addSpaceCountry(cars[i].getCountry(), cars));
            System.out.println("transmission: " + addSpaceTransmission(cars[i].getTransmission(), cars) +
                    "; body type: " + addSpaceBodyType(cars[i].getBodyType(), cars) +
                    "; registration No.: " + cars[i].getRegistrationNo() +
                    "; quantity of seats: " + cars[i].getQuantityOfSeats() +
                    "; rubber: " + addSpaceRubber(cars[i].getRubber(), cars));

            System.out.println();
        }
    }

    // Методы Max
    private static int maxLengthBrand(Car[] cars) {
        int maxLengthBrand = cars[0].getBrand().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthBrand < cars[i].getBrand().length()) {
                maxLengthBrand = cars[i].getBrand().length();
            }
        }
        return maxLengthBrand;
    }

    private static int maxLengthModel(Car[] cars) {
        int maxLengthModel = cars[0].getModel().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthModel < cars[i].getModel().length()) {
                maxLengthModel = cars[i].getModel().length();
            }
        }
        return maxLengthModel;
    }

    private static int maxLengthColor(Car[] cars) {
        int maxLengthColor = cars[0].getColor().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthColor < cars[i].getColor().length()) {
                maxLengthColor = cars[i].getColor().length();
            }
        }
        return maxLengthColor;
    }

    private static int maxLengthCountry(Car[] cars) {
        int maxLengthCountry = cars[0].getCountry().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthCountry < cars[i].getCountry().length()) {
                maxLengthCountry = cars[i].getCountry().length();
            }
        }
        return maxLengthCountry;
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
        int maxLengthBodyType = cars[0].getBodyType().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthBodyType < cars[i].getBodyType().length()) {
                maxLengthBodyType = cars[i].getBodyType().length();
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


    //Методы addSpase
    private static String addSpaceModel(String model, Car[] cars) {
        int max = maxLengthModel(cars);
        String fullModel = model;
        if (model.length() < max) {
            for (int i = 0; i < (max - model.length()); i++) {
                fullModel = fullModel + ".";
            }
        }
        return fullModel + "...";
    }

    private static String addSpaceColor(String color, Car[] cars) {
        int max = maxLengthColor(cars);
        String fullColor = color;
        if (color.length() < max) {
            for (int i = 0; i < (max - color.length()); i++) {
                fullColor = fullColor + ".";
            }
        }
        return fullColor + "...";
    }

    private static String addSpaceCountry(String country, Car[] cars) {
        int max = maxLengthCountry(cars);
        String fullCountry = country;
        if (country.length() < max) {
            for (int i = 0; i < (max - country.length()); i++) {
                fullCountry = fullCountry + ".";
            }
        }
        return fullCountry + "...";
    }

    private static String addSpaceBrand(String brand, Car[] cars) {
        int max = maxLengthBrand(cars);
        String fullBrand = brand;
        if (brand.length() < max) {
            for (int i = 0; i < (max - brand.length()); i++) {
                fullBrand = fullBrand + ".";
            }
        }
        return fullBrand + "...";
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

