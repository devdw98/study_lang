package ex07;

import java.util.Arrays;

public class Ex19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer{
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품 저장
    int i = 0;

    void buy(Product p){
        if(this.money < p.price){
            System.out.println("잔액이 부족하여" +p.toString()+"을/를 살 수 없습니다.");
            return;
        }
        this.money -= p.price;
        add(p);
    }

    void add(Product p){
        if(cart.length <= this.i){
            int j = cart.length * 2;
            this.cart = Arrays.copyOf(this.cart, j);
        }
        this.cart[this.i] = p;
        this.i++;
    }
    void summary(){
        int money = 0;
        System.out.print("구입한 물건: ");
        for(Product p : this.cart){
            System.out.print(p+",");
            money += p.price;
        }
        System.out.println();
        System.out.println("사용한 금액: "+ money);
        System.out.println("남은 금액: "+ this.money);
    }

}

class Product{
    int price;

    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{
    Tv(){super(100);}

    public String toString(){
        return "tv";
    }
}

class Computer extends Product{
    Computer(){super(200);}

    public String toString(){
        return "computer";
    }
}

class Audio extends Product{
    Audio(){super(50);}

    public String toString(){
        return "audio";
    }
}