package week8.sorting_cards;

import java.util.ArrayList;
import java.util.HashMap;


public class Card implements Comparable<Card> {
    public static final int SPADES = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;

    private final HashMap<Integer, String> suits = new HashMap<>();
    private final HashMap<Integer, String> values = new HashMap<>();

    public final int value;
    public final int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;

        this.suits.put(0, "Spades");
        this.suits.put(1, "Diamond");
        this.suits.put(2, "Hearts");
        this.suits.put(3, "Clubs");

        this.values.put(2, "2");
        this.values.put(3, "3");
        this.values.put(4, "4");
        this.values.put(5, "5");
        this.values.put(6, "6");
        this.values.put(7, "7");
        this.values.put(8, "8");
        this.values.put(9, "9");
        this.values.put(10, "10");
        this.values.put(11, "J");
        this.values.put(12, "Q");
        this.values.put(13, "K");
        this.values.put(14, "A");
    }

    @Override
    public String toString() {
        return this.values.get(this.value)
                + " of " + this.suits.get(this.suit);
    }

    public int getValue() {
        return this.value;
    }

    public int getSuit() {
        return this.suit;
    }

    //Make your Cards class Comparable.
// Implement the compareTo method so that cards would be sorted in ascending order according to their value.
// If the value of two classes have got the same values,
// we compare them against their suit in ascending order:
// spades first,
// diamonds second,
// hearts third,
// and clubs last.
    @Override
    public int compareTo(Card otherCard) {
        if (this.value == otherCard.getValue() && this.suit > otherCard.getSuit()) {
            return 0;
        } else if (this.value > otherCard.getValue()) {
            return 1;
        }

        return -1;
    }
}
