package Java8Feature2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Feature01 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                11, 22, 33, 44, 55, 66, 77, 88,
                22, 33, 99, 100, 100, 11, 45, 67, 88);

        // 1. Find all even numbers.
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("1. Even numbers: " + evenNumbers);

        // 2. Find all odd numbers.
        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .toList();
        System.out.println("2. Odd numbers: " + oddNumbers);

        // 3. Find numbers greater than 50.
        List<Integer> greaterThan50 = numbers.stream()
                .filter(number -> number > 50)
                .toList();
        System.out.println("3. Numbers greater than 50: " + greaterThan50);

        // 4. Find numbers whose decimal representation starts with 1.
        List<Integer> startingWith1 = numbers.stream()
                .filter(number -> String.valueOf(number).startsWith("1"))
                .toList();
        System.out.println("4. Numbers starting with 1: " + startingWith1);

        // 5. Find duplicate numbers, preserving encounter order.
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = numbers.stream()
                .filter(number -> !seen.add(number))
                .distinct()
                .toList();
        System.out.println("5. Duplicate numbers: " + duplicates);

        // 6. Find values that occur exactly once.
        Map<Integer, Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        List<Integer> uniqueNumbers = numbers.stream()
                .filter(number -> frequency.get(number) == 1)
                .toList();
        System.out.println("6. Unique numbers: " + uniqueNumbers);

        // 7. Remove duplicates while retaining the original order.
        List<Integer> withoutDuplicates = numbers.stream()
                .distinct().toList();
        System.out.println("7. Numbers without duplicates: " + withoutDuplicates);

        // 8. Find the first element.
        Integer firstElement = numbers.stream().findFirst().orElse(null);
        System.out.println("8. First element: " + firstElement);

        // 9. Find the maximum number.
        Integer maximum = numbers.stream().max(Integer::compareTo).orElse(null);
        System.out.println("9. Maximum number: " + maximum);

        // 10. Find the minimum number.
        Integer minimum = numbers.stream().min(Integer::compareTo).orElse(null);
        System.out.println("10. Minimum number: " + minimum);

        // 11. Find the second-highest distinct number.
        Integer secondHighest = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("11. Second-highest number: " + secondHighest);

        // 12. Find the second-lowest distinct number.
        Integer secondLowest = numbers.stream().distinct()
                .sorted().skip(1).findFirst().orElse(null);
        System.out.println("12. Second-lowest number: " + secondLowest);

        // 13. Sort numbers in ascending order.
        List<Integer> ascending = numbers.stream().sorted().toList();
        System.out.println("13. Ascending order: " + ascending);

        // 14. Sort numbers in descending order.
        List<Integer> descending = numbers.stream()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println("14. Descending order: " + descending);

        // 15. Find the sum of all numbers.
        int total = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("15. Sum: " + total);

        // 16. Find the average of all numbers.
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("16. Average: " + average);

        // 17. Count the total number of elements.
        long elementCount = numbers.stream().count();
        System.out.println("17. Total element count: " + elementCount);

        // 18. Count numbers greater than 50.
        long greaterThan50Count = numbers.stream().filter(number -> number > 50).count();
        System.out.println("18. Count greater than 50: " + greaterThan50Count);

        // 19. Find the top three highest distinct numbers.
        List<Integer> top3 = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("19. Top 3 highest numbers: " + top3);

        // 20. Find the bottom three lowest distinct numbers.
        List<Integer> bottom3 = numbers.stream()
                .distinct().sorted().limit(3).toList();
        System.out.println("20. Bottom 3 numbers: " + bottom3);

        // 21. Find the frequency of every number.
        System.out.println("21. Frequency of every number: " + frequency);

        // 22. Find numbers that appear more than once.
        List<Integer> appearingMoreThanOnce = frequency.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("22. Numbers appearing more than once: " + appearingMoreThanOnce);

        // 23. Partition numbers into even (true) and odd (false).
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
        System.out.println("23. Even/odd partition: " + partitioned);

        // 24. Group numbers using readable even and odd labels.
        Map<String, List<Integer>> groupedByParity = numbers.stream()
                .collect(Collectors.groupingBy(
                        number -> number % 2 == 0 ? "Even" : "Odd",
                        LinkedHashMap::new, Collectors.toList()));
        System.out.println("24. Grouped by even/odd: " + groupedByParity);

        // 25. Find the sum of all even numbers.
        int evenSum = numbers.stream().filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue).sum();
        System.out.println("25. Sum of even numbers: " + evenSum);

        // 26. Find the sum of all odd numbers.
        int oddSum = numbers.stream().filter(number -> number % 2 != 0)
                .mapToInt(Integer::intValue).sum();
        System.out.println("26. Sum of odd numbers: " + oddSum);

        // 27. Find the first non-repeated number.
        Integer firstNonRepeated = numbers.stream()
                .filter(number -> frequency.get(number) == 1)
                .findFirst().orElse(null);
        System.out.println("27. First non-repeated number: " + firstNonRepeated);

        // 28. Find the first repeated number in encounter order.
        Set<Integer> repeatedCheck = new HashSet<>();
        Integer firstRepeated = numbers.stream()
                .filter(number -> !repeatedCheck.add(number))
                .findFirst().orElse(null);
        System.out.println("28. First repeated number: " + firstRepeated);

        // 29. Convert the list into a comma-separated string.
        String commaSeparated = numbers.stream()
                .map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("29. Comma-separated values: " + commaSeparated);

        // 30. Square every number, remove duplicate squares, and sort descending.
        List<Integer> squaredDescending = numbers.stream()
                .map(number -> number * number).distinct()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println("30. Unique squares in descending order: " + squaredDescending);
    }
}
