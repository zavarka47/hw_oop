package lesson_4.transport.Transport;

public class Truck extends Transport implements competing{
    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity ) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    // Методы Get
    public LoadCapacity getLoadCapacity() {
        return loadCapacity;}

    // Методы implements
    public void pitStop() {
        System.out.print("Pit-Stop time - 1 min 20 sec; ");}
    @Override
    public void bestTimeCircle() {
        System.out.print("Best time of circle - 16 min 37 sec; ");}
    @Override
    public void maxSped() {
        System.out.print("Max Sped - 112 km/h; ");}

    // Метод для урока Enum

    @Override
    public void printTyp() {
        System.out.println("load capacity: " + loadCapacity) ;
    }

    // Метод для урока Exception


}
