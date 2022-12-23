package transport;

public class Car extends transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNo;
    private final int quantityOfSeats;
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

        public void setKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
        }
        public void setRemoteStart(boolean remoteStart) {
            this.remoteStart = remoteStart;
        }

         public boolean getRemoteStart () {
             return remoteStart;
         }
         public boolean getKeylessAccess () {
             return keylessAccess;
         }

        public String getNameKey() {
            return nameKey;
        }

        private static boolean checkBoolean (boolean b) {
            if (b = Boolean.parseBoolean(null)) {
                throw new IllegalArgumentException("Информация не указана");
            }
            return b;
        }


    }



    public Car (String brand, String model, double engineVolume, String color, int year, String country,
         String transmission, String bodyType, String registrationNo, int quantityOfSeats, String rubber,
                Key key){
        super(brand, model, year, color, country);

        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;}

        this.transmission = checkString(transmission);
        this.bodyType = checkString(bodyType);
        this.registrationNo = checkString(registrationNo);
        this.quantityOfSeats = checkInt(quantityOfSeats);
        this.rubber = checkString(rubber);
        this.key = key;
    }

    // Методы Get
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getTransmission() {return transmission;}
    public String getBodyType() {return bodyType;}
    public String getRegistrationNo() {return registrationNo;}
    public int getQuantityOfSeats() {return quantityOfSeats;}
    public String getRubber() {return rubber;}


// Методы Set
    public void setEngineVolume(double engineVolume) {this.engineVolume = engineVolume;}
    public void setTransmission(String transmission) {this.transmission = transmission;}
    public void setNo(String no) {this.registrationNo = no;}
    public void setRubber(String summerRubber) {this.rubber = summerRubber;}


    @Override
    public String toString() {
        return  "brand: " + getBrand() + "; model: " + getModel() + "; engineVolume: " + engineVolume + "; color: " + getColor() + "; year: " + getYear() + "; country: " + getCountry();}

}
