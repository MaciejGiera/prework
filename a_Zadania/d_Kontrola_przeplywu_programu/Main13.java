
public class Main13 {

    public static void main(String[] args) {
      int points = 70;
      if (points < 0) {
        System.out.println("Liczba punktów mniejsza niż 0.");
      }
      else if (points > 100) {
        System.out.println("Liczba punktów większa niż 100.");
      }
      else {
        System.out.print("Wynik: ocena ");
        if (points < 40){
          System.out.print("niedostateczna"+"\n");
        }
        else if (points < 55) {
          System.out.print("dopuszczająca"+"\n");
        }
        else if (points < 70) {
          System.out.print("dostateczna"+"\n");
        }
        else if (points < 85) {
          System.out.print("dobra"+"\n");
        }
        else if (points < 99) {
          System.out.print("bardzo dobra"+"\n");
        }
        else {
          System.out.print("celująca"+"\n");
        }
      }

    }

}
