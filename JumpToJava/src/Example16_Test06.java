import java.io.*;
import java.util.Scanner;

public class Example16_Test06 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int first = 12; //sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int second = 22; // sc.nextInt();

        int result = first + second;
        System.out.println(result);

        PrintWriter pw = new PrintWriter(new FileWriter("E:sample.txt",true));
        pw.write(sc.nextLine());
        pw.close();

        FileWriter fw = new FileWriter("E:sample2.txt");
        fw.write("Life is too short \n"
                + "you need python");

        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("E:sample2.txt"));
        while (true) {

            String line = br.readLine();
            if (line == null) break;
            line = line.replaceAll("python", "java");
            System.out.println(line);

        }
        br.close();

    }
}
