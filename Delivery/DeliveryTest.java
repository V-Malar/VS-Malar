package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {

    @Test
    void testDeliveryTimeValidInput() {
        String validInput = "August 19, 2023 11:30:00 PM";
        Delivery delivery = new Delivery();
        assertDoesNotThrow(() -> delivery.deliveryTime(validInput));
    }

    @Test
    void testDeliveryTimeInvalidInput() {
        String invalidInput = "Invalid date";
        Delivery delivery = new Delivery();
        assertDoesNotThrow(() -> delivery.deliveryTime(invalidInput));
    }
}
