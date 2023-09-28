import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        char arrayCharakter[] = new char[25];


        for (int i = 0; i < 25; i++) {
            int random = (int) (Math.random() * 26) + 65;

            arrayCharakter[i] = (char) random;

        }

        for (int j = 0; j < arrayCharakter.length; j++) {
            System.out.print(arrayCharakter[j] + " ");

        }
        System.out.println(

        );

        for (int k = arrayCharakter.length - 1; k >= 0; k--) {
            System.out.print(arrayCharakter[k] + " ");
        }
        System.out.println();

        String arrayCharakterToString = new String(arrayCharakter);

        StringBuilder sb = new StringBuilder(arrayCharakterToString);
        System.out.println(sb.reverse());

        int wieViel = 3;


        for(int i = 0; i < wieViel; i++) {
            char last= arrayCharakter[0];

          for (int j = 0; j < arrayCharakter.length - 1; j++) {
              arrayCharakter[j] = arrayCharakter[j+1];
          }
            arrayCharakter[arrayCharakter.length-1] = last;

            System.out.println(arrayCharakter[arrayCharakter.length-1]);
        }

        for(int i = 0; i < arrayCharakter.length; i++) {
            System.out.print(arrayCharakter[i]);
        }
    }
}
