package week7.dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private final HashMap<String, String> words = new HashMap<String, String>();

    public Dictionary() {
    }

    public String translate(String word) {
        return words.getOrDefault(word, "Unknow word!");

    }

    public void add(String word, String translation) {
        if (this.words.containsKey(word)) {
            System.out.println("Already in the list");
        } else
            this.words.put(word, translation);

    }

    public int amountOfWords() {
        return words.size();
    }

    public ArrayList<String> translationList() {

        ArrayList<String> list = new ArrayList<>();
        for (String key : this.words.keySet()) {
            list.add(key + " = " + this.words.get(key));
        }

        return list;
    }

}
