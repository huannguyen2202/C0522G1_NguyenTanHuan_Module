package home_work.util;


import home_work.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {

    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeStudentFile(String path, List<Student> students) throws IOException {
        String data = "";
        for (Student student: students){
            data += student.getInfo();
        }

        writeFile(path, data);
    }

    private static void writeFileRemove(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeStudentFileRemove(String path, List<Student> students) throws IOException {
        String data = "";
        for (Student student: students){
            data += student.getInfo();
        }

        writeFileRemove(path, data);
    }
}
