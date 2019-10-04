
public class Main5 {

	public static void main(String[] args) {
		int[] numbers = {-12, -47, -11, -44, -99, -51, -24, -45, -8, -70};
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println(max);

	}

}
