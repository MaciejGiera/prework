
public class Main16 {

    public static void main(String[] args) {
      //Tworzę liczby całkowite
      int x = 111, y = 111;
      // Tworzę zmienne do algorytmy Euklidesa
      int A, B, reszta=1;
      //przypisuję większą z wartości do A a mniejszą do b
      if (x > y) {
        A = x;
        B = y;
      }
      else {
        A = y;
        B = x;
      }

      //Stosuję algorytm Euklidesa
      while (reszta != 0) {
        reszta = A % B;
        A = B;
        B = reszta;
      }
      System.out.println("Dla liczb " + x + " i " + y + " GDC to: " + A);

    }

}
