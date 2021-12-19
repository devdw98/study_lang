package ex07;

public class Ex01{
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for(SutdaCard card : deck.cards){
            System.out.print(card+", ");
        }
    }
}