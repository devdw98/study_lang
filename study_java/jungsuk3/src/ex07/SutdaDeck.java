package ex07;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        int isKwangNum = 0;
        for(int i = 0; i < CARD_NUM; i++){
            int num = i % 10 + 1;
            if((num == 1 || num == 3 || num == 8) && (isKwangNum < 3)){
                this.cards[i] = new SutdaCard(num,true);
                isKwangNum++;
            }else{
                this.cards[i] = new SutdaCard(num, false);
            }
        }
    }

    void shuffle(){
        int shuffleNum = (int)(Math.random() * 10)+1;
        for(int i = 0; i < shuffleNum; i++){
            int index = (int)(Math.random() * this.CARD_NUM);

            SutdaCard tmp = this.cards[index];
            this.cards[index] = this.cards[i];
            this.cards[i] = tmp;
        }
    }

    SutdaCard pick(int index){
        return this.cards[index];
    }

    SutdaCard pick(){
        int index = (int)(Math.random()*this.CARD_NUM);
        return this.cards[index];
    }
}

class SutdaCard {
    private final int num;
    private final boolean isKwang;

    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K":"");
    }
}
