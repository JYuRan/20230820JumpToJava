import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Example21_Stream {

    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};


        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            if (data[i] % 2 == 0){
                dataList.add(data[i]);

            }
        }
        HashSet<Integer> dataSet = new HashSet<>(dataList);


        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);


        distinctList.sort(Comparator.reverseOrder());


        int[] result = new int[distinctList.size()];
        for (int i = 0; i < distinctList.size(); i++) {
            result[i] = distinctList.get(i);

        }

    }
}
