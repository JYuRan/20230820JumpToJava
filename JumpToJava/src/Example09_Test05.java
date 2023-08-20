import java.util.ArrayList;
import java.util.Arrays;

class Calculator{
    int value;
    Calculator(){
        this.value = 0; // 생성 시 값 0
    }

    void add(int val){
        this.value += val; // add(숫자) 호출 시 덧셈
    }

    int getValue() {
        return this.value;  // 함수 호출시 계산된 값 리턴
    }

    boolean isOdd(int val){ // 짝수일 경우 false 리턴
        if (val % 2 == 1) {
            return true;

        }else {
            return false;
        }
    }

    int avg(int[] val){ // 평군을 리턴
        return Arrays.stream(val).sum()/ val.length;
    }

    int avg(ArrayList<Integer> val){ // 평군을 리턴
        return val.stream().mapToInt(Integer::intValue).sum()/ val.size();
    }
}

class UpgreadeCalculator extends Calculator{
    void minus(int val){
        this.value -= val;
    }
}

class MaxLimitCalculator extends UpgreadeCalculator{
    // add , minus, getValue 함수 사용 가능
    // 100 초과시 100 제공
    @Override
    int getValue() {
        if (value > 100){
            return 100;
        }
        return super.getValue();
    }
}


public class Example09_Test05 {

    public static void main(String[] args) {
        Calculator cal = new Calculator();  // value = 0
        cal.add(10);    // 10
        System.out.println(cal.getValue());

        UpgreadeCalculator cal2 = new UpgreadeCalculator();
        cal2.add(10);
        cal2.minus(3);
        System.out.println(cal2.getValue());

        MaxLimitCalculator cal3 = new MaxLimitCalculator();
        cal3.add(50);
        cal3.add(60);
        System.out.println(cal3.getValue());

        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(4));

        int[] data = {1, 3, 5, 7, 9};
        int result_avg = cal.avg(data);
        System.out.println(result_avg);

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        result_avg = cal.avg(data2);
        System.out.println(result_avg);
    }
}

