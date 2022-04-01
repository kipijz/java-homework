package io.codelex.advanced.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> basketArray = new ArrayList<>();

    public int getCurrentNumberOfItems() {
        return basketArray.size();
    }

    public void addToBasket(T content) throws BasketFullException {
        if (basketArray.size() >= 10) {
            throw new BasketFullException("The basket is full!");
        } else {
            basketArray.add(content);
        }
    }

    public void removeFromBasket(T content) throws BasketEmptyException {
        if (basketArray.size() < 1) {
            throw new BasketEmptyException("The basket is empty!");
        } else {
            basketArray.remove(content);
        }
    }
}
