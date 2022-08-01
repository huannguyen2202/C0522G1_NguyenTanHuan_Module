package case_study.utils;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterEmployeeFile {
    private static List<String> readFile(String path) {
        List<String> stringList;
        stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals("")){
                    stringList.add(line);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }
    public static List<Employee> readEmployeeInformationFile(String path) {
        List<String> stringList = readFile(path);
        List<Employee> employees = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            employees.add(new Employee(
                    Integer.parseInt(info[0]),
                    info[1],
                    info[2],
                    info[3],
                    Integer.parseInt(info[4]),
                    Integer.parseInt(info[5]),
                    info[6],
                    info[7],
                    info[8],
                    Double.parseDouble(info[9])));
        }
        return employees;
    }

    private static void writerFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writerEmployeeInformationFile(String path, List<Employee> employees) {
        StringBuilder data = new StringBuilder();
        for (Employee employee : employees) {
            data.append(employee.getInfo());
        }

        writerFile(path, data.toString());
    }
}
