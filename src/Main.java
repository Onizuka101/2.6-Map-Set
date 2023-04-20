import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(nums);
        task1(nums);
        task2(nums);
        task3(List.of("Привет","Привет","привет"));
        task4(List.of("один", "один", "два","два", "два", "три", "три", "три"));
    }
    private static void task1(List<Integer> nums) {
        System.out.println("Задача 1");
        for (Integer number : nums) {
             if (number %2== 1){
                System.out.print(number + " ");
            }
        }
        System.out.println(" ");
    }
    private static void task2(List<Integer> nums) {
        System.out.println("Задача 2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer number : set) {
            if (number %2 == 0){
                System.out.print(number + " ");
            }
        }
        System.out.println(" ");
    }
    private static void task3(List<String> words) {
        System.out.println("Задача 3");
        for (String word : words) {
            if (Collections.frequency(words, word)  == 1){
                System.out.print(word + " ");
            }
        }
        System.out.println(" ");
    }
    private static void task4(List<String> words) {
        System.out.println("Задача 4");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)){
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        System.out.print(map + " ");
        System.out.println(" ");
    }
}