package lesson_4.transport.Driver;

import lesson_4.transport.Exceptions.LicenseExceptions;
import lesson_4.transport.Transport.competing;
import lesson_4.transport.Transport.Transport;

public class Driver <T extends Transport & competing> {
    private String fullName;
    private String license;
    private int experience;

// Конструктор
    public Driver(String fullName, String license, int experience) {
        this.fullName = checkString(fullName);
        this.license = license;
        this.experience = checkInt(experience);
    }


// Методы Get
    public String getFullName() {
        return fullName;}
    public String getLicense(){
        return license;}
    public int getExperience() {
        return experience;}


// Методы Set
    public void setFullName(String fullName) {
        this.fullName = checkString(fullName);}
    public void setLicense(String license) {
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
    public static void checkLicense (Driver driver) throws LicenseExceptions {
        String s = driver.getLicense();
        if (driver.getLicense() == null || s.isEmpty() || s.isBlank()){
            throw new LicenseExceptions("Necessary specify license type", driver.getFullName());
        } else {
            System.out.println("Driver " + driver.getFullName() + " dosen`t have a problem with license");
        }
    }


// Методы действий
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
