import java.io.*;

public class Example15_FileReader {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("E:/out.txt");
        input.read(b);
        System.out.println(new String(b));  // 텍스트파일을 배열에 읽어와서 출력할 수 있다
        input.close();

        BufferedReader br = new BufferedReader(new FileReader("E:out2.txt"));
        while (true){
            String line = br.readLine();
            if (line == null)break;
            System.out.println(line);
        }
        br.close();

    }
}
