import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example13_BufferedReader {
    public static void main(String[] args) throws IOException {

        InputStream in = System.in;                             // byte를 읽는다
        InputStreamReader reader = new InputStreamReader(in);   // char
        BufferedReader br = new BufferedReader(reader);         // String

        String a = br.readLine();
        System.out.println(a);
    }
}
