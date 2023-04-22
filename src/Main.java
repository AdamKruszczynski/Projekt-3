public class Main {
    public static void main(String[] args) {

        Integer a = 12;
        metoda(a);
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