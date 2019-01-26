import java.sql.SQLOutput;

public class SquareRoot {

    public static void main(String[] args) {

        double d = Double.parseDouble(args[0]);
        try {
            d = Double.parseDouble(args[0]);


            if (d < 0) {
                //throw IllegalArgumentException("Podano wart mniejszą od 0");
            }
            System.out.println("Pierwiastek kwadratowy Liczby " + args[0] + " to " + Math.sqrt(d));

        } catch (NumberFormatException e) {
            System.out.println("");
        }

    }
}

// nie skończone
