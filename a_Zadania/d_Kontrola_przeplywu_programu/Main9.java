
public class Main9 {

    public static void main(String[] args) {
  
     int n = 3;


     for (int i = 0; i < n; i++) {
         String row = "";

         for (int j = 0; j < n; j++) {
           if (!(i < j)) {
             row += "* ";
           }
           else {
             row += (j+1)+" ";
           }
         }
         System.out.print(row + "\n");
     }
    }

}
