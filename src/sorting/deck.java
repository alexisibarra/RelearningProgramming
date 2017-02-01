package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by alexis on 31/01/17.
 */
public class deck {
    private List<card> deck = new ArrayList<>();

    public List<card> get() {
        return deck;
    }

    public deck() {
        String[] ranks = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = new String[]{"♠", "♣", "♦", "♥"};

        for(String suit: suits) {
            for (String rank : ranks) {
                deck.add(new card(rank + suit));
            }
        }
    }

    public void mess(){
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }
}
