package chap09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);

        try {
            FileWriter writer = new FileWriter("test.txt");

            int c;

            while ((c = in.read()) != -1) {
                writer.write(c);
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
