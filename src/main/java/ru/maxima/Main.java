package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.reflection.Person;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RadioPlayer radioPlayer = context.getBean("radioPlayer", RadioPlayer.class);
        radioPlayer.playRadio();






        //        Person person = context.getBean("person", Person.class);
//        System.out.println(person);





//        RadioPlayer radioPlayer1 = context.getBean("idRadioPlayer", RadioPlayer.class);
//        RadioPlayer radioPlayer2 = context.getBean("idRadioPlayer", RadioPlayer.class);
//
//        boolean isRadioPlayersEquals = radioPlayer1== radioPlayer2;
//        System.out.println("AM frequency of this radio is - " + radioPlayer1.getFrequencyAM());
//        System.out.println("FM frequency of this radio is - "+ radioPlayer1.getFrequencyFM());
//
//        radioPlayer1.playRadio();
//
//        System.out.println(isRadioPlayersEquals);
//
//        context.close();// отработает метод onFinish
//







//     23.03   Radio radio = context.getBean("idOfRadioMaximum", RadioMaximum.class);
//
//        RadioPlayer player = new RadioPlayer(radio);
//        player.playRadio();
//
//        radio = context.getBean("idOfRadioEnergy", RadioEnergy.class);
//        player = new RadioPlayer(radio);
//        player.playRadio();
//
///***  ТЕКСТ ЗАДАНИЯ
// * 1) Создать еще одну радиостанцию
// * 2) сделать так, чтобы радиостанции имели по 3 песни, проигрывать все песни на каждой радиостанции  ***/
//
//        radio = context.getBean("idOfRadioSputnik", RadioSputnik.class);
//        player = new RadioPlayer(radio);
//        player.playRadio();

    }
}


