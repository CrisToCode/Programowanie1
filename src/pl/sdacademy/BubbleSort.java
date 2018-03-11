package pl.sdacademy;

public class BubbleSort {
    public static void main(String[] args) {
        int[] tablica = {5, 4, 2, 9, 2, 4, 7};
        bubblesort(tablica);
        for (int n = 0; n < tablica.length; n++) {
            System.out.print(tablica[n]);
        }
    }

    public static void bubblesort(int[] tablica) {
        int robocza = 0;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 1; j < (tablica.length - i); j++) {
                if (tablica[j - 1] > tablica[j]) {

                    robocza = tablica[j - 1];
                    tablica[j - 1] = tablica[j];
                    tablica[j] = robocza;
                }
            }
        }
    }
}