package chap09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try {
            FileReader input = new FileReader("/Users/yujaeyeong/Downloads/test.txt");

            int c;

            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }

            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
