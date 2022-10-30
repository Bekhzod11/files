package account.service;

import account.models.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl implements FileService{
    private File file = new File("moiler.txt");


    @Override
    public void writeFile(String text, boolean isAppend) {
        try {
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file,isAppend);
            fileOutputStream.write(text.getBytes());
            fileOutputStream.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Account> getAccountList() {
        List<Account> accountList = new ArrayList<>();



        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fileInputStream);
            BufferedReader reader1 = new BufferedReader(reader);
            String row;
            while ((row=reader1.readLine())!=null){
                String[] s = row.split("*");
                Account a = new Account(s[0],s[1],s[2]);
                accountList.add(a);
            }

            fileInputStream.close();
        }


        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
