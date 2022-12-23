package transport;

public abstract class transport {
    private String brand;
    private String model;
    private int year;
    private final String country;
    private String color;
    private int maxSped;

 transport (String brand, String model, int year, String country, String color) {
        this.brand = checkString(brand);
        this.model =  checkString(model);
        this.year = checkInt(year);
        this.country = checkString(country);
        this.color = checkString(color);
    }

    transport (String brand, String model, int year, String country, String color, int maxSped) {
        this.brand = checkString(brand);
        this.model =  checkString(model);
        this.year = checkInt(year);
        this.country = checkString(country);
        this.color = checkString(color);
        this.maxSped = checkInt(maxSped);

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
    protected static String checkString (String string) {
        if (string == null || string.isBlank() || string.isEmpty()) {
            string = "default";
        }
        return string;
    }
    protected static int checkInt (int i) {
        if (i <= 0 ) {
            throw new IllegalArgumentException("Не верно указана информация");
        }
        return i;
    }

    //Метод toString
    public String toString(){
        return "brand: " + brand + " model: " + model + " year: " + year + " country: " + country + " color: " + color + " maxSped: " + maxSped;
    }

}
