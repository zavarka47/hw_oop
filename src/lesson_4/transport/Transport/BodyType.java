package lesson_4.transport.Transport;

public enum BodyType {
    SEDAN("Sedan"),
    HATCHBACK( "Hatchback"),
    COUPE("Coupe"),
    STATION_WAGON("Station Wagon"),
    SUV("SUV"),
    CROSSOVER("Crossover"),
    PICKUP_TRUCK("Pickup Truck"),
    VAN("Van"),
    MINIVAN("Minivan"),
    ROADSTER("Roadster") ;
    private String bodyType;


// Конструктор
    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }


// Метод Get
    public String getBodyType(){
        return bodyType;
    }


// Метод toString
    public String toString(){
        return bodyType;
    }
}



