package io.codelex.advanced.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> basket = new ArrayList<>();

    public int getCurrentNumberOfItems() {
        return basket.size();
    }

    public void addToBasket(T content) throws BasketFullException {
        if (getCurrentNumberOfItems() >= 10) {
            throw new BasketFullException("The basket is full!");
        } else {
            basket.add(content);
        }
    }

    public void removeFromBasket(T content) throws BasketEmptyException {
        if (getCurrentNumberOfItems() < 1) {
            throw new BasketEmptyException("The basket is empty!");
        } else {
            basket.remove(content);
        }
    }
}
