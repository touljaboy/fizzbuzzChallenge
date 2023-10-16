import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzFirst implements FizzBuzz{
    public static void main(String[] args) {
        //1
        //FizzBuzzFirst fizzBuzzFirst = new FizzBuzzFirst();
        //fizzBuzzFirst.print(2, 30);


        //2

    }
    @Override
    public void print(int from, int to) {
        for (int i = from; i <= to; i++) {
            if(i%3 == 0 && i%5==0)
                printMessage("FizzBuzz", i);
            else if(i%5 == 0)
                printMessage("Buzz", i);
            else if(i%3 == 0)
                printMessage("Fizz", i);
        }

    }

    public static void printMessage(String fizzBuzz, int i) {
        System.out.println(i + "-" + fizzBuzz);
    }
}
