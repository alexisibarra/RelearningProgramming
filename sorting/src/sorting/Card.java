package sorting;

/**
 * Created by alexis on 29/01/17.
 */
public class Card implements Comparable<Card>{
    String rank;
    char suit;

    public Card(String cardString) {
        int cardStringLength = cardString.length();

        String suitString = cardString.substring(0, cardStringLength - 1);

        setSuit(cardString.charAt(cardStringLength - 1));
        setRank(suitString);
    }

    public String getRank() {
        return rank;
    }

    public int getRankValue() {
        int value = 0;

        try{
            value = Integer.parseInt(this.getRank());
        } catch (NumberFormatException e){
            char rankChar = this.getRank().charAt(0);

            switch (rankChar){
                case 'J':
                    value = 11;
                    break;
                case 'Q':
                    value = 12;
                    break;
                case 'K':
                    value = 13;
                    break;
            }
        }
        return value;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public String toString() {
        return String.valueOf(getRank()) + String.valueOf(getSuit());
    }

    @Override
    public int compareTo(Card that) {
        if (this.getSuit() > that.getSuit())
            return +1;
        if (this.getSuit() < that.getSuit())
            return -1;
        if(this.getRankValue() > that.getRankValue())
            return 1;
        if(this.getRankValue() < that.getRankValue())
            return -1;
        return 0;
    }
}
