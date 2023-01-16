package lesson_4.transport.Driver;

import lesson_4.transport.Transport.Transport;
import lesson_4.transport.Transport.competing;

import java.util.ArrayList;
import java.util.List;

public class Mechanic <T extends Transport & competing> {
    private String fullName;
    private String company;

// Конструктор
    public Mechanic (String fullName, String company) {
        this.fullName = fullName;
        this.company = company;}

// Методы Get
    public String getFullName() {
        return fullName;}

    public String getCompany() {
        return company;}


// Методы Set
    public void setCompany(String company) {
        this.company = company;}


// Метод toString
    @Override
    public String toString() {
        return fullName +" " + company;}


// Методы действий
    public void CarryOutMaintenance (T transport) {
        System.out.println("Carry out maintenance " + transport.getBrand()  + " " +  transport.getModel());}
    public void Repair (T transport) {
        System.out.println("Repair " + transport.getBrand() + " " + transport.getModel());}

}
