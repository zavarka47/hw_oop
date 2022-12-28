package lesson_4.transport.Driver;

import lesson_4.transport.Transport.competing;
import lesson_4.transport.Transport.transport;

public class Driver<T extends transport & competing> {
    private String fullName;
    private boolean license;
    private int experience;

    public Driver(String fullName, boolean license, int experience) {
        this.fullName = checkString(fullName);
        this.license = license;
        this.experience = checkInt(experience);
    }


    // Методы Get
    public String getFullName() {
        return fullName;}
    public boolean isLicense() {
        return license;}
    public int getExperience() {
        return experience;}


    // Методы Set
    public void setFullName(String fullName) {
        this.fullName = checkString(fullName);}
    public void setLicense(boolean license) {
        this.license = license;}


    // Методы check
    private static String checkString (String string){
        if (string == null || string.isEmpty() || string.isBlank()) {
            throw new IllegalArgumentException("Не верно указана информация");
        }
        return string;
    }
    private static int checkInt (int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Не верно указана информация");
        }
        return i;
    }


    // Логические методы
    public static void starting() {
        System.out.println("Move is starting");}
    public static void stopping() {
        System.out.println("Move is finishing");}
    public static void refueling(){ System.out.println("Refuel the car");}
    public void driving(T transport){
        System.out.println("Водитель " + getFullName() +
                " управляет автомобилем " + transport.getBrand() + " " +transport.getModel() +
                " и будет участвовать в заезде");
    }

}
