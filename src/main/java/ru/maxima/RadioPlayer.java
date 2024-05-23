package ru.maxima;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

interface Radio {
    String getCurrentSong();
}
//======================================================================

@Getter
@Setter
class RadioMaximum implements Radio {
    private String song;
    private String song1;
    private String song2;
    public RadioMaximum(String s, String s1, String s2) {
        this.song = s;
        this.song1 = s1;
        this.song2 = s2;
    }
    @Override
    public String getCurrentSong() {
        ArrayList<String> songs = new ArrayList<>();
        songs.add(song);
        songs.add(song1);
        songs.add(song2);
        Random r = new Random();
        int x = r.nextInt(2);
        return songs.get(x);
    }
}

//======================================================================
@Getter
@Setter
class RadioDinamit implements Radio {
    private String song;
    private String song1;
    private String song2;
    public RadioDinamit(String s, String s2, String s3) {
        this.song = s;
        this.song1 = s2;
        this.song2 = s3;
    }
    @Override
    public String getCurrentSong() {
        ArrayList<String> songs = new ArrayList<>();
        songs.add(song);
        songs.add(song1);
        songs.add(song2);
        Random r = new Random();
        int x = r.nextInt(2);
        return songs.get(x);
    }
}

//======================================================================
@Getter
@Setter
class RadioEnergy implements Radio {
    private String song;
    private String song1;
    private String song2;
    public RadioEnergy(String s, String s1, String s2) {
        this.song = s;
        this.song1 = s1;
        this.song2 = s2;
    }
    @Override
    public String getCurrentSong() {
        ArrayList<String> songs = new ArrayList<>();
        songs.add(song);
        songs.add(song1);
        songs.add(song2);
        Random r = new Random();
        int x = r.nextInt(2);
        return songs.get(x);
    }
}

//======================================================================
@Getter
@Setter
class RadioDacha implements Radio {
    private String song;
    private String song1;
    private String song2;
    public RadioDacha(String s, String s1, String s2) {
        this.song = s;
        this.song1 = s1;
        this.song2 = s2;
    }
    @Override
    public String getCurrentSong() {
        ArrayList<String> songs = new ArrayList<>();
        songs.add(song);
        songs.add(song1);
        songs.add(song2);
        Random r = new Random();
        int x = r.nextInt(2);
        return songs.get(x);
    }
}

//======================================================================
@Getter
@Setter
class RadioSputnik implements Radio {
    private String song;
    private String song1;
    private String song2;
    public RadioSputnik(String s, String s1, String s2) {
        this.song = s;
        this.song1 = s1;
        this.song2 = s2;
    }
    @Override
    public String getCurrentSong() {
        ArrayList<String> songs = new ArrayList<>();
        songs.add(song);
        songs.add(song1);
        songs.add(song2);
        Random r = new Random();
        int x = r.nextInt(2);
        return songs.get(x);
    }
}

//======================================================================
@Getter
@Setter
@Component
public class RadioPlayer {
    private Radio radio;
    private Radio radio1;
    private Radio radio2;
    private Radio radio3;
    private Radio radio4;
    @Autowired
    public RadioPlayer(@Qualifier("idOfRadioMaximum") Radio radio,
                       @Qualifier("idOfRadioDinamit") Radio radio1,
                       @Qualifier("idOfRadioEnergy") Radio radio2,
                       @Qualifier("idOfRadioDacha") Radio radio3,
                       @Qualifier("idOfRadioSputnik") Radio radio4) {
        this.radio = radio;
        this.radio1 = radio1;
        this.radio2 = radio2;
        this.radio3 = radio3;
        this.radio4 = radio4;
    }
    public void playRadio() {
        System.out.println("На радио Maximum играет песня - " + radio.getCurrentSong());
        System.out.println("На радио Dinamit играет песня - "+ radio1.getCurrentSong());
        System.out.println("На радио Energy играет песня - "+ radio2.getCurrentSong());
        System.out.println("На радио Dacha играет песня - "+ radio3.getCurrentSong());
        System.out.println("На радио Sputnik играет песня - "+ radio4.getCurrentSong());
    }
}


