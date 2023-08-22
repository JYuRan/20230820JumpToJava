import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Example14_FileIO {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("E:/out.txt");   // E드라이브에 파일 생성

        for (int i = 1; i<11; i++){
            String data = i+" 번째 줄입니다.\r\n";
            output.write(data.getBytes());
//            1 번째 줄입니다.
//            2 번째 줄입니다.
//            3 번째 줄입니다.
//            4 번째 줄입니다.
//            5 번째 줄입니다.
//            6 번째 줄입니다.
//            7 번째 줄입니다.
//            8 번째 줄입니다.
//            9 번째 줄입니다.
//            10 번째 줄입니다.

        }
        output.close();

        FileWriter fw = new FileWriter("E:/out2.txt");

        for (int i = 0; i < 11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();
        FileWriter fw2 = new FileWriter("E:/out2.txt", true);
        for (int i = 11; i < 21; i++) {
            String data = i+" 번째 줄입니다2.\r\n";
            fw2.write(data);
        }
        fw2.close();

        PrintWriter pw = new PrintWriter( new FileWriter("E:/out2.txt", true));
        // 쓰기도 하고 출력도 하고
        String data = "asdasd";
        pw.println(data);
        pw.close();
    }
}
