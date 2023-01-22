package lesson_4.transport.Transport;

import lesson_4.transport.Driver.Driver;
import lesson_4.transport.Driver.Mechanic;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport implements competing {
    private String brand;
    private String model;
    private double engineVolume;
    protected Driver driver;
    protected List<Mechanic> mechanics = new ArrayList<>();


// Конструкторы
    Transport(String brand, String model) {
        this.brand = checkString(brand);
        this.model =  checkString(model);
        this.engineVolume = checkDouble(engineVolume);}


    Transport(String brand, String model, double engineVolume) {
        this.brand = checkString(brand);
        this.model =  checkString(model);
        this.engineVolume = checkDouble(engineVolume);}


// Методы Get
    public String getBrand() {
        return brand;}
    public String getModel() {
        return model;}
    public double getEngineVolume() {
        return engineVolume;}

    public List<Mechanic> getMechanics() {
        return mechanics;}

    // Методы Set
    public void setEngineVolume(double engineVolume) {
     this.engineVolume = engineVolume;}


// Метод toString
    public String toString(){
        return "brand: " + brand + "; model: " + model + "; engineVolume: " + engineVolume;}


// Методы check
    protected static String checkString (String string) {
        if (string == null || string.isBlank() || string.isEmpty()) {
            string = "default";
        }
        return string;}
    protected static double checkDouble (double i) {
        if (i <= 0 ) {
            i = 1.2;
            //throw new IllegalArgumentException("Не верно указана информация");
        }
        return i;}


// Методы действий
    public static void startMoving() {
        System.out.println("Move is starting");}
    public static void finishMoving() {
        System.out.println("Move is finishing");}


// Методы implements
    @Override
    public void pitStop() {
    }
    @Override
    public void bestTimeCircle() {
    }
    @Override
    public void maxSped() {
    }


// Методы для урока Enum
    public abstract void printTyp();


// Методы для урока Exception
    public void passDiagnostics(){
    }


    // Методы для урока Collection
    public void getTeam() {
        System.out.println(getBrand() + getModel() + "Team");
        System.out.println("Driver - " + driver.getFullName());
        for (int i = 0; i < mechanics.size(); i++) {
            System.out.println("Mechanic " + (i+1) + " - " + mechanics.get(i));
        }
    }
}
