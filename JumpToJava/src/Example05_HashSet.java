import java.util.Arrays;
import java.util.HashSet;

public class Example05_HashSet {


    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);    // HashSet은 중복과 순서가 없음

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2); // s1에 s2와 곂치는 것이 있는지?(교집합)
        System.out.println(intersection);

        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);  // 합집합

        HashSet<Integer> subtract = new HashSet<>(s1);
        subtract.removeAll(s2);
        System.out.println(subtract);  // 차집합





    }
}
