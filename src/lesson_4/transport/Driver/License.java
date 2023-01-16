package lesson_4.transport.Driver;

public enum License {
    А   ("Motorbike"),
    В	("Car"),
    С	("Truck"),
    D	("Bus"),
    М	("Scooter");
    private String transportType;


// Конструктор
    private License(String transportType) {
        this.transportType = transportType;
    }
    public String getTransportType () {
        return transportType;
    }


// Метод toString
    @Override
    public String toString() {
        return  transportType;
    }
}
