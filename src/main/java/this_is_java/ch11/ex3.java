package this_is_java.ch11;

import java.io.FileInputStream;

public class ex3 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {

        } catch (Exception e) {

        }
    }
}
