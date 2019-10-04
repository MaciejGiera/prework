
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		Random generator = new Random();
		generator.nextInt(21);

		int[] randNumbers = new int[100];

		for (int i = 0; i < randNumbers.length; i++) {
			randNumbers[i] = generator.nextInt(21);
		}
		for (int i = 0; i < randNumbers.length; i++) {
			System.out.print(randNumbers[i]+ ", ");
		}
		System.out.print("\n");
		int sum = 0;

		for (int i = 0; i < randNumbers.length; i++) {
			sum += randNumbers[i];
		}
		System.out.println("Suma 100 wylosowanych liczb od 0 do 20 to: " + sum);

	}

}
