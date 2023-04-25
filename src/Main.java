public class Main {
    public static void main(String[] args)  {

        Integer a = 12;
        metoda(a);

        try{
            dzielenie(10,0);
        }catch (DzieleniePrzezZero e){
            System.out.println("Dzielenie przez zero: " + e);
        }
    }

    public static void dzielenie(int a, int b) throws DzieleniePrzezZero{
        if (b != 0) {
            System.out.println("Wynikiem dzielenia jest: " + a / b);
        } else {
            throw new DzieleniePrzezZero("nie prawidłowe dane");
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