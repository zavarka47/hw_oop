public class Car {
    //марка (brand),
    //модель (model),
    //объем двигателя в литрах (engineVolume),
    //цвет кузова (color),
    //год производства (year),
    //страна сборки (country)
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car (String brand, String model, double engineVolume, String color, int year, String country){
        this.brand = brand;
        if (brand == null || brand.isBlank()) {
            this.brand = "default";}
        this.model = model;
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;}
        this.color = color;
        if (color == null || color.isBlank()) {
            color = "white";}
        this.year = year;
        if (year <= 0) {
            this.year = 2000;}
        this.country = country;
    }
// Методы Get
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return  "brand: " + brand + "; model: " + model + "; engineVolume: " + engineVolume + "; color: " + color + "; year: " + year + "; country: " + country;
    }
}
