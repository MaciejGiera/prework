
public class Main1 {

	public static void main(String[] args) {
		//Tworzę zmienne
		boolean first, second;
		first = true;
		second = false;
		boolean isFirstEqualSecond;
		//Porównuję
		isFirstEqualSecond = first == second;
		//Wypisuję wynik w konsoli
		System.out.println(isFirstEqualSecond);
		//Zmieniam wartość zmiennej
		second = !second;
		//Porównuję
		isFirstEqualSecond = first == second;
		//Wypisuję wynik w konsoli
		System.out.println(isFirstEqualSecond);

	}

}
