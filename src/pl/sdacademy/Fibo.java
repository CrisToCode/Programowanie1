package pl.sdacademy;

public class Fibo {

    public int fibonacciRecursion(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static void main(String[] args) {
        //TODO pobierz indeks elementu ciągu

        //TODO wywołaj funkcje fibo i wyświetl wynik
    }
}
