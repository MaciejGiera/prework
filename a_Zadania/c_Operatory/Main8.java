
public class Main8 {

	public static void main(String[] args) {
		int black = 16, white = 15;
		boolean blackOrWhite, goodOrBad, comparison, good = true, bad = false;

		//black jest większe od white, więc wynik false
		blackOrWhite = black < white;
		System.out.println(blackOrWhite);

		//jesli chociaż jedna zmienna ma wartość true, to wynik ma wartość true
		goodOrBad = good || bad;
		System.out.println(goodOrBad);

		//Obie zienne muszą mieć wartość true aby wynik był true
		comparison = blackOrWhite && goodOrBad;
		System.out.println(comparison);




	}

}
