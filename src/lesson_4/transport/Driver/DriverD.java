package lesson_4.transport.Driver;

import lesson_4.transport.Transport.competing;
import lesson_4.transport.Transport.Transport;

public class DriverD <T extends Transport & competing> extends Driver {
    public DriverD(String fullName, String license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void driving(Transport Bus) {
        super.driving(Bus);
    }
}