import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzThird implements FizzBuzz{

    @Override
    public void print(int from, int to) {
        List<Integer> collect = new ArrayList<>();
        for (Integer i = from; i <= to; i++) {
            collect.add(i);
        }
        for (Integer value : collect) {
            if(value%3 == 0 && value%5==0)
                FizzBuzzFirst.printMessage("FizzBuzz", value);
            else if(value%5 == 0)
                FizzBuzzFirst.printMessage("Buzz", value);
            else if(value%3 == 0)
                FizzBuzzFirst.printMessage("Fizz", value);
            }
        }
    }

