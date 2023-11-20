package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void car() {
        Car car = new Car("Seat","Leon");
        Assertions.assertEquals("Seat,Leon", car);
    }
}
