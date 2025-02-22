package Hw38;
import java.util.List;
import java.util.stream.Collectors;

//N1
int sumOfSquares(List<Integer> numbers) {
    return numbers.stream()
            .map(x -> x * x)
            .collect(Collectors.summingInt(Integer::intValue));
}
//N2
List<String> startWithB(List<String> strings) {
    return strings.stream()
            .filter(s -> s.startsWith("B"))
            .collect(Collectors.toList());
}