package bai_lam_them.bank.utils;

import bai_lam_them.bank.model.SavingBankAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteSavingFileUtil {
    private static List<String> readFile(String path) {
        List<String> stringList;
        stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals("")) {
                    stringList.add(line);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }

    public static List<SavingBankAccount> readSavingBankAccountFile(String path) {
        List<String> stringList = readFile(path);
        List<SavingBankAccount> savingBankAccounts = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            savingBankAccounts.add(new SavingBankAccount(
                    Integer.parseInt(info[0]),
                    info[1],
                    info[2],
                    info[3],
                    Integer.parseInt(info[4]),
                    info[5],
                    Double.parseDouble(info[6]),
                    Integer.parseInt(info[7])));
        }
        return savingBankAccounts;
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

    public static void writerSavingBankAccountFile(String path, List<SavingBankAccount> savingBankAccounts) {
        StringBuilder data = new StringBuilder();
        for (SavingBankAccount savingBankAccount : savingBankAccounts) {
            data.append(savingBankAccount.getInfo());
        }
        writerFile(path, data.toString());
    }
}
