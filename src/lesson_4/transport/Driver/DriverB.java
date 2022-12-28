package lesson_4.transport.Driver;

import lesson_4.transport.Transport.competing;
import lesson_4.transport.Transport.transport;

public class DriverB <T extends transport & competing> extends Driver {
    public DriverB(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void driving(transport Car) {
        super.driving(Car);
    }
}

