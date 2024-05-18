package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Radio radio = context.getBean("idOfRadioMaximum", RadioMaximum.class);

        RadioPlayer player = new RadioPlayer(radio);
        player.playRadio();

        radio = context.getBean("idOfRadioEnergy", RadioEnergy.class);
        player = new RadioPlayer(radio);
        player.playRadio();

/***  ТЕКСТ ЗАДАНИЯ
 * 1) Создать еще одну радиостанцию
 * 2) сделать так, чтобы радиостанции имели по 3 песни, проигрывать все песни на каждой радиостанции  ***/

        radio = context.getBean("idOfRadioSputnik", RadioSputnik.class);
        player = new RadioPlayer(radio);
        player.playRadio();

    }
}


