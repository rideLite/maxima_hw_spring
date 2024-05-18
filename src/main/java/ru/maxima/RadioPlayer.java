package ru.maxima;
interface Radio{
    String getCurrentSong();
}
class RadioMaximum implements Radio {
    private String song;

    public RadioMaximum(String s, String s2, String s3) {
        this.song = s;
        this.song = s2;
        this.song = s3;
    }

    @Override
    public String getCurrentSong(){
        return song;
    }
}

class RadioEnergy implements Radio{

    private String song;


    public RadioEnergy(String s, String s2, String s3) {
        this.song = s;
        this.song = s2;
        this.song = s3;
    }

    @Override
    public String getCurrentSong(){
        return song;
    }
}

class RadioSputnik implements Radio {
    private String song;
    public RadioSputnik(String s, String s2, String s3) {
        this.song = s;
        this.song = s2;
        this.song = s3;
    }

    @Override
    public String getCurrentSong() {
        return song;
    }
}

public class RadioPlayer {
    private Radio radio;
    public RadioPlayer(Radio radio) {
        this.radio = radio;
    }
    public void playRadio(){
        System.out.println(radio.getCurrentSong());
    }
}


