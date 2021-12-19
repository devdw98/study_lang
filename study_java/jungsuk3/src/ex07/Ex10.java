package ex07;

public class Ex10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: "+t.getChannel());
//        t.setVolume(20);
//        System.out.println("VOL: "+t.getVolume());
        t.setChannel(20);
        System.out.println("CH: "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: "+t.getChannel());


    }
}
