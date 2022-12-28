package lesson_4.transport.Transport;

public class Bus extends transport implements competing {

    private String country;
    private String color;
    private int maxSped;
    private int year;
    private BusCapacity busCapacity;

    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.busCapacity = busCapacity;
    }

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
    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

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


    // implements
    public void pitStop() {
        System.out.print("Pit-Stop time - 1 min 17 sec; ");}
    public void bestTimeCircle() {
        System.out.print("Best time of circle - 8 min 56 sec; ");}
    @Override
    public void maxSped() {
        System.out.print("Max Sped - 121 km/h; ");}

    // Метод для Enum

    @Override
    public void printTyp() {
        System.out.println("bus capacity: " + busCapacity);
    }
}
