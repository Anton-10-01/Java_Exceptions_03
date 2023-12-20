package Java_Exceptions_03.HomeWork;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeData(String data, String path) {
        System.out.println(path);
        System.out.println(path.getClass().getSimpleName());
        try(FileWriter fw = new FileWriter("Java_Exceptions_03\\HomeWork\\" + path, true)) {
            fw.append(data);
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
