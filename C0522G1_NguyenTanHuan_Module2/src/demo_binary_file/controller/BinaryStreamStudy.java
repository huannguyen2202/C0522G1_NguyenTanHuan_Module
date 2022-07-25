package demo_binary_file.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryStreamStudy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> strings = new ArrayList<>();
        strings.add("Nguyễn Tấn Huân");
        strings.add("Nguyễn Tất Thành");
        //Write file
        FileOutputStream fileOutputStream = new FileOutputStream("src/demo_binary_file/data/data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(strings);
        objectOutputStream.close();
        // Read File
        FileInputStream fileInputStream = new FileInputStream("src/demo_binary_file/data/data.dat");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        List<String> stringRead = (List<String>) objectInputStream.readObject();
        System.out.println(stringRead);
        objectInputStream.close();
    }

}
