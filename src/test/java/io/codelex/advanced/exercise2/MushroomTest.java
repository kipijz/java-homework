package io.codelex.advanced.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MushroomTest {

    @Test
    void testBasketOfMushroomsAddingFunctionality() throws BasketFullException {
        Basket<Mushroom> basketOfMushrooms = new Basket<>();
        Mushroom mushroom = new Mushroom();
        basketOfMushrooms.addToBasket(mushroom);
        Assertions.assertEquals(1, basketOfMushrooms.getCurrentNumberOfItems());
    }

    @Test
    void testThrowBasketFullException() throws BasketFullException {
        Basket<Mushroom> basketOfMushrooms = new Basket<>();
        Throwable exception = Assertions.assertThrows(BasketFullException.class, () -> {
            for (int i = 0; i < 11; i++) {
                basketOfMushrooms.addToBasket(new Mushroom());
            }
        });
        Assertions.assertEquals("The basket is full!", exception.getMessage());
    }
}
