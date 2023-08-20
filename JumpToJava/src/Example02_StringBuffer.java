public class Example02_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);

        sb.insert(0, "lol ");
        System.out.println(sb.toString());

    }
}
