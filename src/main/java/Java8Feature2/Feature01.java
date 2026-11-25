package Java8Feature2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Feature01 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
                11, 22, 33, 44, 55, 66, 77, 88,
                22, 33, 99, 100, 100, 11, 45, 67, 88);

        // Find duplicates
        Set<Integer> set = new HashSet<>();
        List<Integer> findDuplicate = list.stream()
                .filter(n -> !set.add(n))
                .distinct()
                .toList();
        System.out.println(findDuplicate);

        // Second-highest number
        Integer secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighest);

        // Frequency of each number
        Map<Integer, Long> frequency = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(frequency);

        //Even/odd partitioning
        Map<Boolean, List<Integer>> result = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(result);


        // Top 3 highest unique numbers
        List<Integer> top3 = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(top3);



    }

}

/*

Here are 30 Java 8 interview coding questions worth practicing:

Find all even numbers from the list.
Find all odd numbers.
Find numbers greater than 50.
Find numbers starting with 1.
Find duplicate numbers.
Find unique numbers.
Remove duplicates from the list.
Find the first element.
Find the maximum number.
Find the minimum number.
Find the second-highest number.
Find the second-lowest number.
Sort numbers in ascending order.
Sort numbers in descending order.
Find the sum of all numbers.
Find the average of all numbers.
Count the total number of elements.
Count numbers greater than 50.
Find the top 3 highest numbers.
Find the bottom 3 numbers.
Find the frequency/count of every number.
Find numbers appearing more than once.
Partition numbers into even and odd.
Group numbers based on even and odd.
Find the sum of even numbers.
Find the sum of odd numbers.
Find the first non-repeated number.
Find the first repeated number.
Convert List<Integer> into a comma-separated String.
Square every number, remove duplicates, and return them sorted in descending order.

 */
