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
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
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
