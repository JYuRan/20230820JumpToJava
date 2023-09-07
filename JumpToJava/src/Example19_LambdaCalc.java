interface Calc1{
    int sum(int a, int b);
}

public class Example19_LambdaCalc {
    public static void main(String[] args) {
        Calc1 mc = (int a, int b) -> a+b;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
