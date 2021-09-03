package ex06;

public class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    SutdaCard(){
        this.num = 1;
        this.isKwang = true;
    }
    String info(){
        String result = String.valueOf(this.num);
        if(isKwang)
            result = result.concat("K");
        return result;
    }
}