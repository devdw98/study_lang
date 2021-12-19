package ex07;

public class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int prevChannel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    MyTv2(){
        this.isPowerOn = false;
        this.channel = MIN_CHANNEL;
        this.prevChannel = 0;
        this.volume = MIN_VOLUME;
    }

    public void setPowerOn(){
        this.isPowerOn = !this.isPowerOn;
    }
    public boolean getPowerOn(){
        return this.isPowerOn;
    }
    public void setChannel(int channel) {
        this.prevChannel = this.channel;
        if(channel < MIN_CHANNEL || channel > MAX_CHANNEL){
            this.channel = 1;
        }else {
            this.channel = channel;
        }
    }
    public int getChannel(){
        return this.channel;
    }
    public void setVolume(int volume){
        if(volume < MIN_VOLUME || volume > MAX_VOLUME)
            this.volume = 1;
        else
            this.volume = volume;
    }
    public int getVolume(){
        return this.volume;
    }

    public void gotoPrevChannel(){
        int tmp = this.channel;
        this.channel = this.prevChannel;
        this.prevChannel = tmp;
    }
}
