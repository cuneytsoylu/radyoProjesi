package radyoProjesi;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static radyoProjesi.Yonetici.cikis;

public class Kullanici {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    static Scanner scan=new Scanner(System.in);
    static String yanit="";


    public static void kullanici() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        String yonetici="\n"+RED+"DINLEMEK ISTEDIGINIZ KANALI SECINIZ\n"+
                GREEN+"1 : POWER FM\n"+
                YELLOW+"2 : SLOW TURK\n"+
                BLUE +  "3 : METRO FM\n"+
                PURPLE+ "4 : VIRGIN RADIO\n"+
                CYAN+  "5 : ALEM FM\n"+
                WHITE+ "6 : CIKIS";
        System.out.println(yonetici);
        yanit = scan.next();
        switch (yanit) {
            case "1":
                powerFm();
                break;
                case "2":
                    slowTurk();
                    break;
            case "3":
                metroFm();
                break;
            case "4":
                virginRadio();
                break;
                case "5":
                    alemFm();
                    break;
            case "6":
               cikis();
                break;
        }

    }

    public static void powerFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file =new File("src/radyoProjesi/Riv-Riv-Riv.wav");
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);
        while(!yanit.equalsIgnoreCase("Q")){
            System.out.println(GREEN+"1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI\n"+
                    "Q : CIKIS");
            yanit =scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    kullanici();

                    break;
                case"q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n"+
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);
                }
            }
        }


    }
    public static void slowTurk() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file =new File("src/radyoProjesi/Zeynep Bastık Ara.wav");
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while(!yanit.equalsIgnoreCase("Q")){
            System.out.println(GREEN+"1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI\n"+
                    "Q : CIKIS");

            yanit =scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    kullanici();

                    break;
                case"q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n"+
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);
                }
            }
        }


    }
    public static void metroFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file =new File("src/radyoProjesi/the moon.wav");
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while(!yanit.equalsIgnoreCase("Q")){
            System.out.println(GREEN+"1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI\n"+
                    "Q : CIKIS");
            yanit =scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    kullanici();

                    break;
                case"q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n"+
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);
                }
            }
        }


    }
    public static void virginRadio() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file =new File("src/radyoProjesi/ezhel.wav");
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while(!yanit.equalsIgnoreCase("Q")){
            System.out.println(GREEN+"1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI\n"+
                    "Q : CIKIS");

            yanit =scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    kullanici();

                    break;
                case"q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n"+
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);
                }
            }
        }


    }
    public static void alemFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file =new File("src/radyoProjesi/PAnda.wav");
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);
        while(!yanit.equalsIgnoreCase("Q")){
            System.out.println(GREEN+"1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI\n"+
                    "Q : CIKIS");

            yanit =scan.next();
            switch (yanit){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                case "4":
                    clip.stop();
                    kullanici();

                    break;
                case"q":
                    clip.stop();
                    cikis();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\n"+
                            "SECIM EKRANINA YONLENDIRILIYORSUNUZ");
                    Thread.sleep(3000);
                }
            }
        }


    }


}
