import java.io.IOException;
import java.io.InputStream;

public class Example11_inputStream {

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int a ;
        a = in.read();


        System.out.println(a);

    }
}
