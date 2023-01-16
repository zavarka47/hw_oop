package lesson_4.transport.Transport;

import lesson_4.transport.Driver.Driver;
import lesson_4.transport.Driver.Mechanic;

public class Car extends Transport implements competing {
    private String color;
    private int year;
    private String country;
    private String transmission;
    private BodyType bodyType;
    private String registrationNo;
    private int quantityOfSeats;
    private String rubber;
    private Key key;



    public static class Key {
        String nameKey;
        boolean remoteStart;
        boolean keylessAccess;

        public Key (String nameKey, boolean remoteStart, boolean keylessAccess) {
            this.nameKey = nameKey;
            this.remoteStart = checkBoolean(remoteStart);
            this.keylessAccess = checkBoolean(keylessAccess);


            checkString(nameKey);
        }

        // Методы Set
        public void setKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;}
        public void setRemoteStart(boolean remoteStart) {
            this.remoteStart = remoteStart;}

        // Методы Get
         public boolean getRemoteStart () {
             return remoteStart;}
         public boolean getKeylessAccess () {
             return keylessAccess;}
        public String getNameKey() {
            return nameKey;}


        // Методы Check
        private static boolean checkBoolean (boolean b) {
            if (b = Boolean.parseBoolean(null)) {
                throw new IllegalArgumentException("Информация не указана");}
            return b;}

        // Метод toString

        @Override
        public String toString() {
            return "Key{" + "nameKey: " + nameKey + "; remoteStart: " + remoteStart + "; keylessAccess: " + keylessAccess + '}';}
    }




    public Car (String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

    }
    public Car (String brand, String model, double engineVolume, String color, int year, String country,
         String transmission, BodyType bodyType, String registrationNo, int quantityOfSeats, String rubber,
                Key key){
        super(brand, model, engineVolume);
        this.color = checkString(color);
        this.year = checkInt(year);
        this.country = checkString(country);
        this.transmission = checkString(transmission);
        this.registrationNo = checkString(registrationNo);
        this.quantityOfSeats = checkInt(quantityOfSeats);
        this.rubber = checkString(rubber);
        this.key = key;
        this.bodyType = bodyType;
    }

    // Методы Get

    public String getColor() {
        return color;}
    public int getYear() {
        return year;}
    public String getCountry() {
        return country;}
    public Key getKey() {
        return key;}
    public String getTransmission() {
        return transmission;}
    public BodyType getBodyType() {
        return bodyType;}
    public String getRegistrationNo() {
        return registrationNo;}
    public int getQuantityOfSeats() {
        return quantityOfSeats;}
    public String getRubber() {
        return rubber;}


    // Методы Set
    public void setTransmission(String transmission) {
        this.transmission = transmission;}
    public void setNo(String no) {
        this.registrationNo = no;}
    public void setRubber(String summerRubber) {
        this.rubber = summerRubber;}
    public void setColor(String color) {
        this.color = color;}
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;}
    public void setKey(Key key) {
        this.key = key;}

    // Методы check
    private static int checkInt (int i) {
        if (i <= 0) {
            i = 1;
            //throw new IllegalArgumentException("Не верно указана информация");
        }
        return i;
    }




    // Методы implements
    @Override
    public void pitStop() {
        System.out.print("Pit-Stop time - 40 sec; ");}
    @Override
    public void bestTimeCircle() {
        System.out.print("Best time of circle - 3 min 12 sec; ");}
    @Override
    public void maxSped() {
        System.out.print("Max Sped - 148 km/h; ");}

    //Метод для Enum
    @Override
    public void printTyp() {
        System.out.println("body type: " + bodyType);
    }

    // Метод для урока Exception
    @Override
    public void passDiagnostics() {
        super.passDiagnostics();
    }


    // Методы для урока Collection
    public void addDriverToTeam(Driver<Car> driver) {
        Driver = driver;
    }
    public void addMechanicToTeam(Mechanic<Car> mechanic) {
        if (mechanics.size() == 0){
            mechanics.add(mechanic);
        } else {
            for (int i = 0; i < mechanics.size(); i++) {
                if (!mechanics.contains(mechanic)) {
                    mechanics.add(mechanic);
                }
            }
        }
    }


}
