package functions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import io.quarkus.funqy.Funq;

/**
 * Your Function class
 */
public class Function {

    /**
     * Use the Quarkus Funqy extension for our function. This function simply echoes its input
     * @param input a Java bean
     * @return a Java bean
     */
    @Funq
    public String function() {
        return String.valueOf(calculatePi(100000));
    }

    public double calculatePi(int precision) {
        List<Integer> numbers = IntStream.range(3, precision).boxed().filter(i -> i % 2 != 0).collect(Collectors.toList());

        double pi = 4;
        for (int i = 0; i<numbers.size(); i++) {
            if ((i+1)%2==0) {
                pi += 4.0/numbers.get(i);
            } else {
                pi -= 4.0/numbers.get(i);
            }
        }

        return pi;
    }

}
