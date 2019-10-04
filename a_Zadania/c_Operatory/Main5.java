
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		//Najpierw zmienna jest zwiększana, potem wyświetlana; wyświetla 2
		System.out.println(++a);
		//Zmienna najpierw jest wyświetlana, dopiero potem zwiększana; wyświetla 2
		System.out.println(a++);
		//Wyświetla aktualną wartość zmiennej, czyli 3
		System.out.println(a);
		//Najpierw b przyjmuje wartość a, potem a jest zwiększane
		b=a++;
		System.out.println(b);
		//Najpierw a jest zwiększone, później b przyjmuje wartość a
		b=++a;
		System.out.println(++a);
	}

}
