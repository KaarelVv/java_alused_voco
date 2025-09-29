package week8.online_shop;

import java.util.*;

public class ShoppingBasket {
    Map<String, Purchase> purchase = new HashMap<>();

    public ShoppingBasket() {
    }

    public void add(String product, int price) {
        if (purchase.containsKey(product)) {
            purchase.get(product).increaseAmount();
        } else
            purchase.put(product, new Purchase(product, 1, price));
    }

    public int price() {
        List<Purchase> values = new ArrayList<>(purchase.values());
        int basketPrice = 0;
        for (Purchase i : values) {
            basketPrice += i.price();
        }
        return basketPrice;
    }

    public void print() {
        List<Purchase> values = new ArrayList<>(purchase.values());

        for (Purchase i : values) {
            System.out.println(i);
        }

    }
}
