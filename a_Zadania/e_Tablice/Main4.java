
public class Main4 {

	public static void main(String[] args) {
		int[] numbers = {12, 47, 11, 44, 32, 51, 24, 45, 78, 70};
		int sumOdd = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]%2 == 0) {
				System.out.println(numbers[i]);
			}
			else {
				sumOdd += numbers[i];
			}

		}
		System.out.println("Suma liczb nieparzystych to: " + sumOdd);

	}

}
