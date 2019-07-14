package by.mironenka.taskone;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

//Задание. Ввести n чисел с консоли.
//1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
//2.     Вывести числа в порядке возрастания (убывания) значений их длины.
//3.     Вы вести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

public class Runner {

    private final static int NUMBER = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.printf("%s %s %s %n", "Enter ", NUMBER, " numbers, please");

        for(int i = 0; i < NUMBER; i++) {

            list.add(Integer.parseInt(scanner.next()));
        }

        for(Integer number : list) {
            System.out.print(number);
            System.out.println(" -  the number of digits is " + String.valueOf(Math.abs(number)).length());
        }

        System.out.printf("%s %d %n", "The shortest number is ", findShortestNumber(list));
        System.out.printf("%s %d %n", "The longest number is ", findLongestNumber(list));
        System.out.println("sort by ascending " + sortNumbersLengthsByAscending(list));
        System.out.println("sort by descending " + sortNumbersLengthsByDescending(list));
        System.out.println("average length is " + getAverageValue(createListOfNumbersLength(list)));
        System.out.println("numbers with length less than average " +
                getNumbersWhoseLengthLessThanAverage(list, getAverageValue(createListOfNumbersLength(list))));
        System.out.println("numbers with length more than average " +
                getNumbersWhoseLengthMoreThanAverage(list, getAverageValue(createListOfNumbersLength(list))));
    }

    public static int findShortestNumber(List<Integer> list) {

        int shortestNumber = list.get(0);

        for(int i = 1; i < list.size(); i++) {

            if(String.valueOf(Math.abs(list.get(i))).length() < String.valueOf(Math.abs(shortestNumber)).length()) {

                shortestNumber = list.get(i);
            }
        }

        return shortestNumber;

    }

    public static int findLongestNumber(List<Integer> list) {

        int longestNumber = list.get(0);

        for(int i = 1; i < list.size(); i++) {

            if(String.valueOf(Math.abs(list.get(i))).length() > String.valueOf(Math.abs(longestNumber)).length()) {

                longestNumber = list.get(i);
            }
        }

        return longestNumber;
    }

    public static Map<Integer, Integer> sortNumbersLengthsByAscending(List<Integer> list) {

        Map<Integer, Integer> map = createMapFromList(list);

        Map<Integer, Integer> sorted = map
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));

        return sorted;
    }

    public static Map<Integer, Integer> sortNumbersLengthsByDescending(List<Integer> list) {

        Map<Integer, Integer> map = createMapFromList(list);

        Map<Integer, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        return sorted;
    }

    public static Map<Integer, Integer> createMapFromList(List<Integer> list) {

        Map<Integer, Integer> map = new HashMap<>();

        for(Integer number : list) {

            map.put(number, String.valueOf(Math.abs(number)).length());
        }

        return map;
    }

    public static List<Integer> createListOfNumbersLength(List<Integer> list) {

        List<Integer> lenghtList = new ArrayList<>();
        for(Integer number : list) {

            lenghtList.add(String.valueOf(Math.abs(number)).length());
        }

        return lenghtList;
    }

    public static int getAverageValue(List<Integer> list) {

        int sum = 0;
        for(Integer number : list) {
            sum = sum + number;
        }
        return sum / list.size();
    }

    public static Map<Integer, Integer> getNumbersWhoseLengthLessThanAverage(List<Integer> list, int averageLength) {

        Map<Integer, Integer> result = new HashMap<>();

        for(Integer number : list) {

            int length = String.valueOf(Math.abs(number)).length();
            if(length < averageLength) {
                result.put(number, length);
            }
        }

        return result;
    }

    public static Map<Integer, Integer> getNumbersWhoseLengthMoreThanAverage(List<Integer> list, int averageLength) {

        Map<Integer, Integer> result = new HashMap<>();

        for(Integer number : list) {

            int length = String.valueOf(Math.abs(number)).length();
            if(length > averageLength) {
                result.put(number, length);
            }
        }

        return result;
    }
}
