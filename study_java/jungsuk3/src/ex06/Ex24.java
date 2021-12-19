package ex06;

public class Ex24 {
    static int abs(int v){
        return v > 0 ? v : (-1)*v;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값 :"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값 :"+abs(value));
    }
}
