import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random random = new Random();
        LosowaLiczba liczba = () -> {
                int i = random.nextInt(100);
                System.out.println(i);
                return i;
        };

        metoda(liczba.losujLiczbe());

        try{
            int a = liczba.losujLiczbe();
            int b = 2;

            Runnable runnable = () -> System.out.println("A: " +  a + ", B: " + b);

            runnable.run();
            dzielenie(a, b, 1);

        }catch (DzieleniePrzezZero e){
            System.out.println("Dzielenie przez zero: " + e);
        }
    }

    public static <Integer> void dzielenie(int a, int b, Integer c) throws DzieleniePrzezZero{
        if (c.equals(1)) {
            if (b != 0) {
                System.out.println("Wynikiem dzielenia jest: " + a / b);
            } else {
                throw new DzieleniePrzezZero("nie prawidłowe dane");
            }
        } else if (c.equals(2)) {
                System.out.println("Wynikiem mnożenia jest: " + a * b);
        }else if (c.equals(3)) {
            System.out.println("Wynikiem dodawania jest: " + a + b);
        }else if (c.equals(4)) {
            System.out.println("Wynikiem odejmowania jest: " + (a - b));
        }else {
            System.out.println("Podaj poprawna liczbę");
        }
    }

    public static void metoda(Number number){
        if (number instanceof Integer){
            System.out.println("Liczba jest typu: Integer");
        } else if (number instanceof  Double) {
            System.out.println("Liczba jest typu: Double");
        } else {
            System.out.println("Nieoczekiwna liczba! Zmień jej typ i spróbuj ponowanie!");
        }

    }
}