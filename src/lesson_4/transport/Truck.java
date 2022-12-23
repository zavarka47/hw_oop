package lesson_4.transport;

public class Truck extends transport implements competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    // Методы implements
    public void pitStop() {
        System.out.print("Pit-Stop time - 1 min 20 sec; ");}
    @Override
    public void bestTimeCircle() {
        System.out.print("Best time of circle - 16 min 37 sec; ");}
    @Override
    public void maxSped() {
        System.out.print("Max Sped - 112 km/h; ");}
}
