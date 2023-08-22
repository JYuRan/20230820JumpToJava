import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example12_StreamReader {

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        char[] a = new char[3];
        reader.read(a);

        System.out.println(a);
        
        // 받아온 값을 문자로 읽어온다, byte 대신 char형태로
    }
}
