/*
streams
java.util.stream
functional programming style
it does not store data but operate on source
S*/
import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class StreamExamples {
    public static void main(String[] args) {
        // Sample data
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "Eve");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream Creation
        Stream<String> nameStream = names.stream();

        // Intermediate Operations
        System.out.println("Filter:");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println); // Output: Alice, Alice

        System.out.println("\nMap:");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println); // Output: ALICE, BOB, CHARLIE, ALICE, EVE

        System.out.println("\nDistinct:");
        names.stream()
                .distinct()
                .forEach(System.out::println); // Output: Alice, Bob, Charlie, Eve

        System.out.println("\nSorted:");
        names.stream()
                .sorted()
                .forEach(System.out::println); // Output: Alice, Alice, Bob, Charlie, Eve

        System.out.println("\nLimit:");
        numbers.stream()
                .limit(5)
                .forEach(System.out::println); // Output: 1, 2, 3, 4, 5

        System.out.println("\nSkip:");
        numbers.stream()
                .skip(5)
                .forEach(System.out::println); // Output: 6, 7, 8, 9, 10

        System.out.println("\nFlatMap:");
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("One", "Two"),
                Arrays.asList("Three", "Four")
        );
        nestedList.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println); // Output: One, Two, Three, Four

        // Terminal Operations
        System.out.println("\nForEach:");
        numbers.stream()
                .forEach(System.out::println); // Output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        System.out.println("\nCollect:");
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]

        System.out.println("\nReduce:");
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum); // Output: 55

        System.out.println("\nCount:");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count); // Output: 5

        System.out.println("\nMatch:");
        boolean anyMatch = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Any match: " + anyMatch); // Output: true
        boolean allMatch = numbers.stream().allMatch(n -> n > 0);
        System.out.println("All match: " + allMatch); // Output: true
        boolean noneMatch = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("None match: " + noneMatch); // Output: true

        System.out.println("\nFindFirst:");
        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresent(System.out::println); // Output: 1

        System.out.println("\nFindAny:");
        Optional<Integer> any = numbers.stream().findAny();
        any.ifPresent(System.out::println); // Output: (any element, depends on execution)

        // Parallel Streams
        System.out.println("\nParallel Stream:");
        numbers.parallelStream()
                .map(n -> n * n)
                .forEach(System.out::println); // Output: Squares of numbers in any order

        // Specialized Streams (IntStream)
        System.out.println("\nIntStream:");
        IntStream.range(1, 6).forEach(System.out::println); // Output: 1, 2, 3, 4, 5

        // Files Stream
        System.out.println("\nFiles Stream:");
        try {
            Files.lines(Paths.get("example.txt"))
                 .filter(line -> line.contains("error"))
                 .forEach(System.out::println); // Output: Lines with "error" from file
        } catch (IOException e) {
            System.out.println("File not found.");
        }

        // Grouping and Counting
        System.out.println("\nGrouping:");
        Map<String, Long> groupedNames = names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println(groupedNames); // Output: {Alice=2, Bob=1, Charlie=1, Eve=1}

        System.out.println("\nPartitioning:");
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioned); // Output: {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}
    }
}

