package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Write the path to the file");
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                numbers.add(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(numbers);
        Integer min = numbers.get(0);
        Integer max = numbers.get(numbers.size() - 1);

        double median = findMedian(numbers);
        Double average = findAverage(numbers);

        System.out.println("Largest number in the file: " + max);
        System.out.println("Smallest number in the file: " + min);
        System.out.println("Median: " + median);
        System.out.println("Average: " + average);
    }

    public static double findMedian(List<Integer> numbers) {
        int size = numbers.size();
        if (size % 2 != 0) {
            return numbers.get(size / 2);
        } else {
            Integer middle1 = numbers.get(size / 2 - 1);
            Integer middle2 = numbers.get(size / 2);

            return (middle1 + middle2) / 2.0;
        }
    }

    public static Double findAverage(List<Integer> numbers) {
        Double sum = 0.0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}