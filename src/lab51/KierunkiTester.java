package lab51;

import lab51.Kierunki;


public class KierunkiTester {

    public static void main(String[] args) {

        //KierunkiWszystkie kierunkiWszystkie = new KierunkiWszystkie("Północ", "N");
        for (Kierunki k : Kierunki.values()) {

            System.out.println("Idziemy w kierunku " + k.getPolskaNazwa() + " w skrócie " + k.getSkrót());
        }

    }
}
