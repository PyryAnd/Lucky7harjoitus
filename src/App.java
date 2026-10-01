import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner in = new Scanner(System.in);
    Random r = new Random();

    System.out.println("Paljon laitetaan peliin? ($)");
    int rahat = in.nextInt();
    in.nextLine();


//PELIN ALKU
    while (rahat > 0) {
        //Maksu
        rahat--;

        int num1 = r.nextInt(10)+1;
        int num2 = r.nextInt(10)+1;
        int num3 = r.nextInt(10)+1;
        int[] numerot = {num1, num2, num3};

        int voitot = 0;

        System.out.println("Sinulla on " + rahat + "$, yksi Spin on 1$");
        System.out.println("Numerot ovat = " +num1 + ", " +num2 + ", " +num3);

        //FOR LOOP LASKEMAAN SEISKAT
        for (int i = 0; i < numerot.length; i++) {
            if (numerot[i] == 7) 
                {
                voitot++;
                }
        }
        //VOITON LASKEMINEN
        if (voitot == 1) {
            System.out.println("Voitit 3$!");
            rahat += 3;
        } else if (voitot == 2) {
            System.out.println("Voitit 5$!");
            rahat += 5;
        } else if (voitot == 3) {
            System.out.println("Voitit 7$ HOLY MAX WIN!!!!");
            rahat += 7;
        }

        System.out.println("Rahaa jäljellä: " + rahat + "$");

        if (rahat > 0) {
            System.out.println("Haluatko pelata uudestaan? (Y/N)?");
            String uudestaan = in.nextLine();

            if (uudestaan.equalsIgnoreCase("n")) {
                break;
            }
        }
   
    }

    System.out.println("Peli päättyi, sinulle jäi " + rahat + "$");


    }
}
