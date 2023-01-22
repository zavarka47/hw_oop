package lesson_4.transport.Exceptions;

import lesson_4.transport.Driver.Driver;

public class LicenseExceptions extends Exception {
    private Driver driver;
    public LicenseExceptions(String message, String driverName) {
        super(message);
        this.driver = driver;
    }
    public String getNameDriver() {
        return driver.getFullName();
    }
}
