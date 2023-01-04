package lesson_4.transport.Driver;

public enum License {
    А   ("Motorbike"),
    В	("Car"),
    С	("Truck"),
    D	("Bus"),
    М	("Scooter");

    private String transportType;

    private License(String transportType) {
        this.transportType = transportType;
    }
    public String getTransportType () {
        return transportType;
    }

    @Override
    public String toString() {
        return  transportType;
    }
}
