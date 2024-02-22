package pl.michalpolom;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegersMeasurement {
    public static void main(String[] args) {

        try {
            List<Integer> input = Arrays.stream(args).map(Integer::valueOf).sorted().toList();
            System.out.println(
                    input.stream().distinct().map(String::valueOf).collect(Collectors.joining(" ")) +
                            "\ncount: " + input.size() +
                            "\ndistinct: " + input.stream().distinct().count() +
                            "\nmin: " + input.get(0) +
                            "\nmax: " + input.get(input.size() - 1)
            );
        } catch (NumberFormatException e) {
            System.out.println("ERROR: At least one of the argument is not an Integer (min=-2147483648, max=2147483647)");
        }
    }
}