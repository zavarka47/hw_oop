package transport;

public class transport {
    String brand;
    String model;
    int year;
    final String country;
    String color;
    int maxSped;

    transport (String brand, String model, int year, String country, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        checkString(brand);
        checkString(model);
        checkString(country);
        checkString(color);
        checkInt(year);
    }

    transport (String brand, String model, int year, String country, String color, int maxSped) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSped = maxSped;
        checkString(brand);
        checkString(model);
        checkString(country);
        checkString(color);
        checkInt(year);
        checkInt(maxSped);
    }
//Методы Get
    public String getBrand() {
        return brand;}

    public String getModel() {
        return model;}

    public int getYear() {
        return year;}

    public String getCountry() {
        return country;}

    public String getColor() {
        return color;}

    public int getMaxSped() {
        return maxSped;}


    // Методы Set
    public void setColor(String color) {
        this.color = color;
    if (color == null || color.isBlank()){
        throw new IllegalArgumentException("Информация указана не верно");}
    }

    public void setMaxSped(int maxSped) {
        this.maxSped = maxSped;
    if (maxSped <= 0){
        throw new IllegalArgumentException("Информация указана не верно");}
    }


    //Методы проверок
    private static void checkString (String string) {
        if (string == null || string.isBlank() || string.isEmpty()) {
            string = "default";
        }
    }
    private static void checkInt (int i) {
        if (i <= 0 ) {
            throw new IllegalArgumentException("Не верно указана информация");
        }
    }

    //Метод toString
    public String toString(){
        return "brand: " + brand + " model: " + model + " year: " + year + " country: " + country + " color: " + color + " maxSped: " + maxSped;
    }

    //Класс Car должен наследовать параметры класса Transport.
}
