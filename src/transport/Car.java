package transport;

public class Car extends transport {
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String bodyType;
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



    public Car (String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }
    public Car (String brand, String model, double engineVolume, String color, int year, String country,
         String transmission, String bodyType, String registrationNo, int quantityOfSeats, String rubber,
                Key key){
        super(brand, model, engineVolume);
        this.color = checkString(color);
        this.year = checkInt(year);
        this.country = checkString(country);
        this.transmission = checkString(transmission);
        this.bodyType = checkString(bodyType);
        this.registrationNo = checkString(registrationNo);
        this.quantityOfSeats = checkInt(quantityOfSeats);
        this.rubber = checkString(rubber);
        this.key = key;
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
    public String getBodyType() {
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

    @Override
    public String toString() {
        return  "brand: " + getBrand() + "; model: " + getModel() + "; engineVolume: " + getEngineVolume() + "; color: " + color + "; year: " +  year + "; country: " + country;}

}
