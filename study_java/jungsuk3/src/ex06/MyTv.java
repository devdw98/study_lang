package ex06;

public class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        this.isPowerOn = !this.isPowerOn;
    }
    void volumeUp(){
        if(this.volume < MAX_VOLUME)
            this.volume += 1;
    }
    void volumeDown(){
        if(this.volume > MIN_VOLUME)
            this.volume -= 1;
    }
    void channelUp(){
        this.channel += 1;
        if(this.channel > MAX_CHANNEL)
            this.channel = MIN_CHANNEL;
    }
    void channelDown(){
        this.channel -= 1;
        if(this.channel < MIN_CHANNEL)
            this.channel = MAX_CHANNEL;
    }
}
