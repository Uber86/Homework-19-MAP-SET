import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Задание №1");
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("Задание №2");

        Set<Integer> set = new TreeSet<>(nums);
        for (Integer i : set) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();
        System.out.println();
        System.out.println("Задание №3");

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> set1 = new HashSet<>(strings);
        System.out.println(set1);

        System.out.println();
        System.out.println("Задание №4");

        Map<String, Integer> map = new HashMap<>();
        for (String word : strings) {
            var num = map.get(word);
            if (num == null) {
                map.put(word, 1);
            } else {
                map.put(word, num + 1);
            }

        }
        System.out.println(map.values());



    }
}