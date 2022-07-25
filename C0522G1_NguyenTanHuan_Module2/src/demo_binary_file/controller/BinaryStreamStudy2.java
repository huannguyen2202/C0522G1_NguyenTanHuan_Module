package demo_binary_file.controller;

import demo_binary_file.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryStreamStudy2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"Nguyễn Tấn Huân",1.5));
        students.add(new Student(1,"Nguyễn Tất Thành",5));
        //Write File
        FileOutputStream fileOutputStream=new FileOutputStream("src/demo_binary_file/data/data.dat");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.close();
        //Read File
        FileInputStream fileInputStream=new FileInputStream("src/demo_binary_file/data/data.dat");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        List<Student> list = (List<Student>) objectInputStream.readObject();
        System.out.println(list);
        objectInputStream.close();

    }


}
