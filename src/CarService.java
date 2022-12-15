public class CarService {
    public static void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("brand: " + addSpaceBrand(cars[i].getBrand(),cars) +
                    "; model: " + addSpaceModel(cars[i].getModel(),cars) +
                    "; engineVolume: " + cars[i].getEngineVolume() +
                    "; color: " + addSpaceColor(cars[i].getColor(),cars) +
                    "; year: " + cars[i].getYear() +
                    "; country: " + addSpaceCountry(cars[i].getCountry(),cars));
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

    private static int maxLengthColor (Car[]cars) {
        int maxLengthColor = cars[0].getColor().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthColor < cars[i].getColor().length()) {
                maxLengthColor = cars[i].getColor().length();
            }
        }
        return maxLengthColor;
    }

    private static int maxLengthCountry (Car[]cars) {
        int maxLengthCountry = cars[0].getCountry().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthCountry < cars[i].getCountry().length()) {
                maxLengthCountry = cars[i].getCountry().length();
            }
        }
        return maxLengthCountry;
    }

    //Методы addSpase

    private static String addSpaceBrand (String brand, Car[]cars) {
        int max = maxLengthBrand(cars);
        String fullBrand = brand;
        if (brand.length() < max) {
            for (int i = 0; i < (max - brand.length()); i++) {
                fullBrand = fullBrand + ".";
            }
        }
        return fullBrand + "...";
    }

    private static String addSpaceModel(String model, Car[]cars) {
        int max = maxLengthModel(cars);
        String fullModel = model;
        if (model.length() < max) {
            for (int i = 0; i < (max - model.length()); i++) {
                fullModel = fullModel + ".";
            }
        }
        return fullModel + "...";
    }

    private static String addSpaceColor (String color, Car[]cars) {
        int max = maxLengthColor(cars);
        String fullColor = color;
        if (color.length() < max) {
            for (int i = 0; i < (max - color.length()); i++) {
                fullColor = fullColor + ".";
            }
        }
        return fullColor + "...";
    }

    private static String addSpaceCountry (String country, Car[]cars) {
        int max = maxLengthCountry(cars);
        String fullCountry = country;
        if (country.length() < max) {
            for (int i = 0; i < (max - country.length()); i++) {
                fullCountry = fullCountry + ".";
            }
        }
        return fullCountry + "...";
    }
}

