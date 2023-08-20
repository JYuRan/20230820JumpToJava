import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


class Calculator2{
    Integer value = 0;

    void add(int val){
        this.value += val;

    }
    public Integer getValue(){
        return this.value;
    }
}

interface Mineral{
    int getValue();
}
class Gold extends MineralCalculator{
    Gold(){
        super.value += 100;
    }
}
class Silver extends MineralCalculator{
    Silver(){
        super.value += 90;
    }
}
class Bronze extends MineralCalculator{
    Bronze(){
        super.value += 80;
    }
}
class MineralCalculator{
    int value = 0;
    public int getValue() {
        return value;
    }

    public void add(MineralCalculator obj) {
        value += obj.getValue();
    }
}

public class Example10_Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2 ,3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());

        Calculator2 cal = new Calculator2();
        cal.add(3);
        cal.add(3);
        System.out.println(cal.getValue());

        MineralCalculator cal2 = new MineralCalculator();
        cal2.add(new Gold());
        cal2.add(new Silver());
        cal2.add(new Bronze());
        System.out.println(cal2.getValue());
    }


}
