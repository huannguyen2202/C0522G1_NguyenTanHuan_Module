package bai_lam_them.bank.utils;

import bai_lam_them.bank.model.PaymentBankAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWritePaymentFileUtil {
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

    public static List<PaymentBankAccount> readPaymentBankAccountFile(String path) {
        List<String> stringList = readFile(path);
        List<PaymentBankAccount> paymentBankAccounts = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            paymentBankAccounts.add(new PaymentBankAccount(
                    Integer.parseInt(info[0]),
                    info[1],
                    info[2],
                    info[3],
                    Integer.parseInt(info[4]),
                    Integer.parseInt(info[5])));
        }
        return paymentBankAccounts;
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

    public static void writerPaymentBankAccountFile(String path, List<PaymentBankAccount> paymentBankAccounts) {
        StringBuilder data = new StringBuilder();
        for (PaymentBankAccount paymentBankAccount : paymentBankAccounts) {
            data.append(paymentBankAccount.getInfo());
        }
        writerFile(path, data.toString());
    }

}
