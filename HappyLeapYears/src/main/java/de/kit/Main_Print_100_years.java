package de.kit;

import java.util.List;
import java.util.stream.IntStream;

public class Main_Print_100_years {
    public static void main(String[] args) {
        HappyLeapYearDetector detector = new HappyLeapYearDetector();

        List<Integer> yearsToCheck = IntStream.rangeClosed(2024, 2124).boxed().toList();
        List<Integer> happyLeapYears = detector.calculateHappyLeapYears(yearsToCheck);

        happyLeapYears.forEach(System.out::println);
    }
}