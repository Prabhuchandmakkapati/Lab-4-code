 import java.util.Random;

public class Card {

    /*
        declare variables suit, faceValue
     */
    private String suit;
    private String faceValue;

    /*
        2 argument constructor
     */
    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    /*
        Define getters and setters
     */
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    /*
        Define String representation of Card
     */
    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", faceValue=" + faceValue +
                '}';
    }

    /*
        Program to generate 5 random cards
     */
    public static void main(String[] args) {

        /*
            Define suits and face-values
         */
        String[] suits = {"spades", "hearts", "diamonds", "clubs"};
        String[] faceValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        /**
         * Generate and print 5 random cards
         */
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            Card card = new Card(suits[random.nextInt(suits.length)], faceValues[random.nextInt(faceValues.length)]);
            System.out.println(card);
        }
    }
}

Sample output Screenshot:
Test Run:1

Card{suit='hearts', faceValue=6}
Card{suit='diamonds', faceValue=10}
Card{suit='clubs', faceValue=7}
Card{suit='clubs', faceValue=K}
Card{suit='diamonds', faceValue=J}

Test Run:2
Card{suit='spades', faceValue=8}
Card{suit='spades', faceValue=A}
Card{suit='clubs', faceValue=8}
Card{suit='hearts', faceValue=J}
Card{suit='hearts', faceValue=J}
Cardfsuit- spades, faceValue-8) card(suit- spades, tacevalue-A) Cardtsuit-clubs, faceValue-8h Card(suït_ hearts, faceva їие cardlsuit-hearts, facevalue-J

