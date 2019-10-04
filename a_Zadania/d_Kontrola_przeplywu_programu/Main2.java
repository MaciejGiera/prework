
public class Main2 {

	public static void main(String[] args) {
		//Tworzę i inicjalizuję zmienne
		int nr1 = 80, nr2 = 6, nr3 = 23;
		//Intrukcja warunkowa
		if (nr1>nr2 && nr1>nr3){ //sprawdzamy czy nr1 jest największe
			System.out.println("Największa z liczb "+nr1+","+nr2+","+nr3+" jest "+nr1);
		}
		else if (nr2>nr1 && nr2>nr3){ //Sprawdzamy czy nr2 jest największe
			System.out.println("Największa z liczb "+nr1+","+nr2+","+nr3+" jest "+nr2);
		}
		else {
			System.out.println("Największa z liczb "+nr1+","+nr2+","+nr3+" jest "+nr3);
		}

	}

}
