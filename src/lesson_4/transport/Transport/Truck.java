package lesson_4.transport.Transport;

import lesson_4.transport.Driver.Driver;
import lesson_4.transport.Driver.Mechanic;

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

    // Метод для урока Collection
    public void addDriverToTeam(Driver<Truck> driver) {
        Driver = driver;
    }

    public void addMechanicToTeam(Mechanic<Truck> mechanic) {
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
