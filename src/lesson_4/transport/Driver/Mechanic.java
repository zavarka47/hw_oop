package lesson_4.transport.Driver;

import lesson_4.transport.Transport.Car;
import lesson_4.transport.Transport.Transport;
import lesson_4.transport.Transport.competing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mechanic <T extends Transport & competing> {
    private String fullName;
    private String company;
    private List<Class<? extends Transport>> classList = new ArrayList<>();


// Конструктор
    public Mechanic (String fullName, String company) {
        this.fullName = fullName;
        this.company = company;}


// Методы Get
    public String getFullName() {
        return fullName;}

    public String getCompany() {
        return company;}

    public List<Class<? extends Transport>> getClassList() {
        return classList;
    }

// Методы Set
    public void setCompany(String company) {
        this.company = company;}


// Метод toString
    @Override
    public String toString() {
        return fullName +" " + company;}


// Методы действий
    public void carryOutMaintenance(T transport) {
        if (classList.contains(transport.getClass())) {
            System.out.println("Carry out maintenance " + transport.getBrand() + " " + transport.getModel());
        } else {
            System.out.println("Mechanic " + fullName + " doesn`t work with " + transport.getClass().getSimpleName());
        }
    }
    public void repair(T transport) {
        if (classList.contains(transport.getClass())) {
            System.out.println("Repair " + transport.getBrand() + " " + transport.getModel());
        } else {
            System.out.println("Mechanic " + fullName + " doesn`t work with " + transport.getClass().getSimpleName());
        }
    }


// Методы параметризации
    public void addTransportClass (Class <? extends Transport> transportClass) {
        classList.add(transportClass);
    }

// Переопределенные методы


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company) && Objects.equals(classList, mechanic.classList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company, classList);
    }
}
