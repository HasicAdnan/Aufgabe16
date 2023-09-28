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

        char newCharArr [] = new char[arrayCharakter.length];

        for (int m = 0; m < newCharArr.length; m++) {
            newCharArr[m] = arrayCharakter[m];
        }

        for(int l = 0; l < arrayCharakter.length; l++) {

            if(l > 21) {
                arrayCharakter[l] = newCharArr[newCharArr.length-l-1];
            } else {arrayCharakter[l] = newCharArr[l+3];
               }
            System.out.print(arrayCharakter [l] + " ");
        }
        System.out.println();

        for(int m = 0; m < arrayCharakter.length; m++) {

            if(m < 4) {
                arrayCharakter[m] = newCharArr[newCharArr.length-m-1];
            } else if (m > 21) {arrayCharakter[m] = newCharArr[newCharArr.length-m-1];
            }
            System.out.print(arrayCharakter [m] + " ");
        }
    }


}