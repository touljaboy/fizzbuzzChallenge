/* Zadanie w klasycznej wersji byłoby zbyt proste, dlatego dla urozmaicenia załóżmy, że istnieje interfejs:

interface FizzBuzz {
    void print(int from, int to);
}
Celem metody print jest wyświetlenie komunikatów Fizz, Buzz lub FizzBuzz, zgodnie z opisem z wcześniejszej części tego zadania, dla domkniętego przedziału [from; to]. Zdefiniuj jego trzy implementacje, przy czym:

pierwsza wykorzystuje klasyczną pętlę for, while lub do while,
druga korzysta ze strumieni z Javy 8,
trzecia wykorzystuje pętlę for each.

 */

public class Main {
    public static void main(String[] args) {
        FizzBuzzFirst fizzBuzzFirst = new FizzBuzzFirst();
        fizzBuzzFirst.print(0, 15);

        FizzBuzzSecond fizzBuzzSecond = new FizzBuzzSecond();
        fizzBuzzSecond.print(0, 15);

        FizzBuzzThird fizzBuzzThird = new FizzBuzzThird();
        fizzBuzzThird.print(0, 15);
    }
}


