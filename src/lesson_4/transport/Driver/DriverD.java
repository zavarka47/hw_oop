package lesson_4.transport.Driver;

import lesson_4.transport.Transport.competing;
import lesson_4.transport.Transport.transport;

public class DriverD <T extends transport & competing> extends Driver {
    public DriverD(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void driving(transport Bus) {
        super.driving(Bus);
    }
}