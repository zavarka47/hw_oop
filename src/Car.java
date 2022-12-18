public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;


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
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
            checkBoolean(remoteStart);
            checkBoolean(keylessAccess);
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

        private void checkBoolean (boolean b) {
            if (b = Boolean.parseBoolean(null)) {
                throw new IllegalArgumentException("Информация не указана");
            }
        }


    }



    public Car (String brand, String model, double engineVolume, String color, int year, String country,
         String transmission, String bodyType, String registrationNo, int quantityOfSeats, String rubber,
                Key key){
        this.brand = brand;
        if (brand == null || brand.isBlank()) {
            brand = "default";}
        this.model = model;
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;}
        this.color = color;
        if (color == null || color.isBlank()) {
            color = "white";}
        this.year = year;
        if (year <= 0) {
            year = 2000;}
        this.country = country;

        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNo = registrationNo;
        this.quantityOfSeats = quantityOfSeats;
        this.rubber = rubber;
        checkString(transmission);
        checkString(bodyType);
        checkString(registrationNo);
        checkInt(quantityOfSeats);
        checkString(rubber);

        this.key = key;
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

    public String getTransmission() {return transmission;}
    public String getBodyType() {return bodyType;}
    public String getRegistrationNo() {return registrationNo;}
    public int getQuantityOfSeats() {return quantityOfSeats;}
    public String getRubber() {return rubber;}


// Методы Set
    public void setEngineVolume(double engineVolume) {this.engineVolume = engineVolume;}
    public void setColor(String color) {this.color = color;}
    public void setTransmission(String transmission) {this.transmission = transmission;}
    public void setNo(String no) {this.registrationNo = no;}
    public void setRubber(String summerRubber) {this.rubber = summerRubber;}


    @Override
    public String toString() {
        return  "brand: " + brand + "; model: " + model + "; engineVolume: " + engineVolume + "; color: " + color + "; year: " + year + "; country: " + country;}

    private static void checkString (String string) {
        if (string == null || string.isBlank()){
            throw new IllegalArgumentException("Информация не указана");
        } else {
            string = "default";}
    }
    private static void checkInt (int i) {
        if (i < 2){
            throw new IllegalArgumentException("Информация не указана");
        } else {
            i = 2;
        }
    }
}
