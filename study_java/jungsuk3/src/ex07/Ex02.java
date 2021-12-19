package ex07;

public class Ex02 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(SutdaCard card : deck.cards)
            System.out.print(card+", ");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
