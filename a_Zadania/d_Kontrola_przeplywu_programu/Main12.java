
public class Main12 {

    public static void main(String[] args) {
      int a = 1, b = 2, c = 3;
      if (a + b > c) {
        if (c + b > a){
          if (a + c > b) {
            System.out.println("Z podanych boków można zbudować trójkąt.");
          }
          else {
            System.out.println("Z podanych boków nie można zbudować trójkąta.");
          }
        }
        else {
          System.out.println("Z podanych boków nie można zbudować trójkąta.");
        }
      }
      else {
        System.out.println("Z podanych boków nie można zbudować trójkąta.");
      }

    }

}
