<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Kontrola przepływu programu – zadania

Pamiętaj, aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań.  
Zadania dodatkowe nie są obowiązkowe do zaliczenia preworku, ale postaraj się je wykonać.

#### Zadanie 1

1. W pliku `Main1.java` stwórz dwie zmienne, o nazwach: `nr1, nr2`, przechowujące liczby całkowite.
2. Następnie za pomocą instrukcji warunkowej ```if ... else ```, wypisz w konsoli, która z nich jest większa.
3. Wypisany String ma być wg wzoru: `Większa liczba to 7.`

#### Zadanie 2

1. W pliku `Main2.java` stwórz trzy zmienne, o nazwach: `nr1, nr2, nr3`, przechowujące liczby całkowite.
2. Następnie, za pomocą instrukcji warunkowej `if ... else if ... else`, wypisz w konsoli, która z nich jest największa.
3. Wypisany String ma być wg wzoru: `Największa z liczb 7,2,11 to 11.`. Pamiętaj, aby wypisywać liczby przy pomocy zmiennych.

#### Zadanie 3

1. W pliku `Main3.java` stwórz pętlę, która 10 razy wypisze w konsoli tekst: *"Lubię Javę"*.
2. Napisz zarówno pętlę `for` jak i pętlę `while`.
3. W sumie napis będzie widoczny 20 razy.

#### Zadanie 4

1. W pliku `Main4.java` stwórz pętlę, która wypisze w konsoli liczby od 1 do 100, jedna w jednej linii.
2. Napisz zarówno pętlę `for` jak i pętlę `while`.
3. W sumie zostanie wypisanych 200 liczb.

#### Zadanie 5

1. W pliku `Main5.java` stwórz zmienną `resultFor` oraz `resultWhile` i przypisz do obu wartość `0`.
2. Następnie stwórz pętlę `for`, która doda do siebie liczby od 1 do 10 i zapisze wynik do zmiennej `resultFor`.
3. Analogicznie stwórz pętlę `while` i zapisz wynik do zmiennej `resultWhile`.
4. Pętle powinny – co uruchomienie (zwane także iteracją pętli) – dodawać do zmiennej `resultFor` lub `resultWhile` kolejną liczbę z podanego zakresu.
5. Wypisz w konsoli, w oddzielnych liniach, zmienne `resultFor` oraz `resultWhile`.

#### Zadanie 6

1. W pliku `Main6.java` napisz kod, który na podstawie wartości zmiennej, np. `int n = 5;` wypisuje wszystkie liczby od zera do **n**.
Przy każdej liczbie wypisz, czy liczba jest parzysta czy nie.  

Wzór:

```
0 – parzysta
1 – nieparzysta
2 – parzysta
3 – nieparzysta
...
```

Zmień wartość zmiennej `n` i uruchom ponownie.
Napisz zarówno pętlę `for` jak i pętlę `while`.

*Podpowiedź: Jak sprawdzić czy liczba jest parzysta lub nieparzysta? Wystarczy obliczyć jej resztę z dzielenia przez `2`, jeżeli wynik to 0, wtedy liczba jest parzysta, w przeciwnym przypadku jest nieparzysta.*

#### Zadanie 7

1. W pliku `Main7.java` stwórz dwie pętle niezależne i wypisz wartości ich liczników w każdej iteracji. 
2. Wykorzystaj np.```System.out.println("i= " + i + " j= " + j);```
3. Zadanie rozwiąż używając dwóch pętli `for`.

*Podpowiedź: Zasada tworzenia pętli zagnieżdżonych (zależnych i niezależnych) została omówiona w prezentacji **Podstawy programowania**. Jeśli masz wątpliwości, zajrzyj do sekcji **Pętle: for, for zagnieżdżony oraz while** w tej prezentacji.*

#### Zadanie 8

W pliku `Main8.java`, jest program, który wypisuje w konsoli
schemat z `n` gwiazdek, taki jak poniżej.  
Przeanalizuj go bardzo dokładnie.
Przykład dla  ```n = 5```:

```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

Używamy do tego zadania pętli zagnieżdżonych! 

#### Zadanie 9

W pliku `Main9.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat:

Przykład dla `n = 5`

```
* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
```

Przykład dla `n = 3`  

```
* 2 3
* * 3
* * *
```

Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli. 

#### Zadanie 10

W pliku `Main10.java` napisz program rysujący na podstawie wartości zmiennej `n` następujący schemat (tutaj dla ```n = 5```).  

```
*
* *
* * *
* * * *
* * * * *
```

Możesz to zadanie rozwiązać na dwa sposoby:

1. używając pętli zależnych,
2. używając pętli niezależnych i instrukcji warunkowej `if`.

*Wzoruj się na poprzednich zadaniach. Trzeba tutaj trochę pomyśleć i rozumieć pętle zagnieżdżone.*


#### Zadanie 11 

W pliku `Main11.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat (tutaj dla ```n = 5```):

```
* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
* * * * *
* * * * 5
* * * 4 5
* * 3 4 5
* 2 3 4 5
```

Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli. 

#### Zadanie 12 – **dodatkowe**

1. W pliku `Main12.java` napisz program definiujący trzy liczby w zmiennych: `a, b, c`.
2. Program ma sprawdzić, czy podane liczby mogą być bokami trójkąta.
3. Tę figurę geometryczną można zbudować z trzech linii tylko wtedy, gdy suma długości dwóch z nich jest większa niż długość trzeciej linii, czyli:

```
a + b > c
c + b > a
a + c > b
```

Po sprawdzeniu wypisz na konsoli odpowiednią informację, wg poniższego wzoru:  
  
`Z podanych boków można zbudować trójkąt.`  
  
lub  

`Z podanych boków nie można zbudować trójkąta.`

#### Zadanie 13 – **dodatkowe**

W pliku `Main13.java` napisz program, który wystawi ocenę z testu.

* `0-39` pkt – ocena niedostateczna 
* `40-54` pkt – ocena dopuszczająca 
* `55-69` pkt – ocena dostateczna 
* `70-84` pkt – ocena dobra 
* `85-98` pkt – ocena bardzo dobra 
* `99-100` pkt – ocena celująca

1. Stwórz zmienną `points`, do której będzie przypisany wynik z testu.
2. Na początku sprawdź, czy liczba punktów jest:
* większa bądź równa `0`, jeśli nie – wypisz na konsoli komunikat: `Liczba punktów mniejsza niż 0.`;
* mniejsza bądź równa `100`, jeśli nie – wypisz na konsoli komunikat: `Liczba punktów większa niż 100.`.
4. Następnie sprawdź jaka ocena odpowiada danej liczbie punktów i wypisz ją na konsoli wg wzoru: `Wynik: ocena dobra`.
5. Rozwiąż to zadanie używając konstrukcji `if ... else if ... else`.

#### Zadanie 14 – **dodatkowe**

W pliku `Main14.java` napisz program tworzący tabliczkę mnożenia dla podanej zmiennej `n`. Na przykład dla ```n = 3``` wynik będzie następujący:

```
1 x 1 = 1  
1 x 2 = 2  
1 x 3 = 3  

2 x 1 = 2  
2 x 2 = 4  
2 x 3 = 6  

3 x 1 = 3  
3 x 2 = 6  
3 x 3 = 9  
```

Do mnożenia liczb użyj operatora `*`.  

Pamiętaj, aby dodać spację pomiędzy liczbami i `x` oraz `=`.

#### Zadanie 15 – **dodatkowe**

W pliku `Main15.java`  

1. Napisz program liczący wartość `x!`, gdzie `!` oznacza silnię, a `x` jest zmienną.  
2. Użyj do tego obu znanych Ci pętli.
3. Silnia ma być zapisana do zmiennej `factorial`.
4. Po wyliczeniu silni wyświetl w konsoli komunikat wg wzoru: `Silnia 3! to 6.`.

**Silnia** to wynik mnożenia wszystkich liczb całkowitych od jeden do podanej liczby włącznie, czyli:

```
5! = 1*2*3*4*5 = 120
8! = 1*2*3*4*5*6*7*8 = 40320
```

#### Zadanie 16 – **dodatkowe**

W pliku `Main16.java` utwórz dwie zmienne: `x` i `y`, będące dodatnimi liczbami całkowitymi.

1. Napisz program wyliczający największy wspólny dzielnik (*greatest common divisor – GDC*) dwóch liczb.
2. Skorzystaj z opisu na tej [stronie][GDC].
3. Wynik wyświetl w konsoli wraz z liczbami, dla których został wyliczony, wg wzoru: `Dla liczb 420 i 168 GDC to: 84`.

<!-- Links -->
[GDC]: http://www.programming-algorithms.net/article/43434/Greatest-common-divisor
