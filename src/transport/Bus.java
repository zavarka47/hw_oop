package transport;

public class Bus extends transport {

    private String country;
    private String color;
    private int maxSped;
    private int year;

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);}

    public Bus(String brand, String model, int year, String country, String color, int maxSped) {
        super(brand,model);
        this.year = checkInt(year);
        this.country = checkString(country);
        this.color = checkString(color);
        this.maxSped = checkInt(maxSped);
    }

    //Методы Get
    public String getCountry() {
        return country;}
    public String getColor() {
        return color;}
    public int getMaxSped() {
        return maxSped;}
    public int getYear() {
        return year;}

    // Методы Set
    public void setColor(String color) {
        this.color = color;}
    public void setMaxSped(int maxSped) {
        this.maxSped = maxSped;}

    // Методы check
    private int checkInt (int i) {
        if (i <= 0) {
            i = 1;
            //throw new IllegalArgumentException("Не верно указана информация");
        }
        return i;}

}
