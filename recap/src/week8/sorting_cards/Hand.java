package week8.sorting_cards;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    private final ArrayList<Card> hands = new ArrayList<>();

    public Hand() {
    }

    public void add(Card card){
            hands.add(card);
    }

    public void print(){

        for (Card card: hands){
            System.out.println(card);
        }
    }

    public void sort(){
        Collections.sort(hands);
    }


}
