import java.util.function.BinaryOperator;

public class Example20_Lambda2 {
    public static void main(String[] args) {
        BinaryOperator<Integer> mc = (a,b) -> a + b;
        int result = mc.apply(3, 4);
        System.out.println(result);
    }
}
