package io.codelex.advanced.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest {

    @Test
    void testBasketOfApplesAddingFunctionality() throws BasketFullException {
        Basket<Apple> basketOfApples = new Basket<>();
        Apple apple = new Apple();
        basketOfApples.addToBasket(apple);
        Assertions.assertEquals(1, basketOfApples.getCurrentNumberOfItems());
    }

    @Test
    void testThrowBasketEmptyException() throws BasketEmptyException {
        Basket<Apple> basketOfApples = new Basket<>();
        Apple apple = new Apple();

        Throwable exception = Assertions.assertThrows(BasketEmptyException.class, () -> basketOfApples.removeFromBasket(apple));
        Assertions.assertEquals("The basket is empty!", exception.getMessage());
    }

}
