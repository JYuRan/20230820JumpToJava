import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Example03_List {
    public static void main(String[] args) {

        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches);

        String result = String.join(", ", pitches);
        System.out.println(result); // 리스트의 내용을 ,로 구분하여 출력

        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);    // 퀵정렬
    }
}
