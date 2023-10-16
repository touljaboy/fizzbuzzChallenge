import java.util.stream.IntStream;

public class FizzBuzzSecond implements FizzBuzz{
    public static void main(String[] args) {

    }

    @Override
    public void print(int from, int to) {
        IntStream
                .range(from, to+1)
                .forEach(value -> {
                    if(value%3 == 0 && value%5==0)
                        FizzBuzzFirst.printMessage("FizzBuzz", value);
                    else if(value%5 == 0)
                        FizzBuzzFirst.printMessage("Buzz", value);
                    else if(value%3 == 0)
                        FizzBuzzFirst.printMessage("Fizz", value);
                });
    }
}
