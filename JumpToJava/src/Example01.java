public class Example01 {
    public static void main(String[] args) {
        String a = "Hello Java";

        System.out.println(a.contains("Java"));
        System.out.println(a.replaceAll("Java", "World"));

        System.out.println(String.format("I eat %d apples.",3));
        System.out.println(String.format("Errors is %d%%", 98));
        System.out.println(String.format("I eat %d apples.",3));


    }


}
