package week8.online_shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private String product;
    private int price;
    private int stock;
    private Map<String, Integer> storehouse= new HashMap<>();
    private HashMap<String, Integer> priceData = new HashMap<>();
    private HashMap<String, Integer> stockData = new HashMap<>();

    public Storehouse(String product, int price, int stock) {
        this.product = product;
        this.price = price;
        this.stock = stock;
    }

    public Storehouse() {
    }

    public void addProduct(String product, int price, int stock) {

        this.priceData.put(product, price);
        this.stockData.put(product,stock);

        this.product = product;
        this.price = price;
        this.stock = stock;

    }

    public int price(String product) {
        Set<String> keys = priceData.keySet();

        for (String key : keys) {
            if (key.contains(product)) {
                return this.priceData.get(key);
            }
        }
        return -99;
    }
    public int stock(String product) {

        Set<String> keys = stockData.keySet();
        for (String key : keys) {
            if (key.contains(product)) {
                return this.stockData.get(key);
            }
        }
        return 0;
    }

    public boolean take(String product) {

        Set<String> keys = stockData.keySet();

        for(String key: keys){
            if(this.stockData.containsKey(product)){
                this.stockData.remove(product);
                return true;
            }
        }

        return false;
    }

    public Set<String> products(){
        return this.stockData.keySet();
    }
}


