package account.service;

import account.models.Account;

import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl implements  AccountService{
private Scanner scanner = new Scanner(System.in);
private FileService fileService = new FileServiceImpl();


  @Override
    public void addAccount() {
        String fullName= scanner.next();
        String phoneNumber=scanner.next();
        String password=scanner.next();
        Account a = new Account(fullName,phoneNumber,password);
       String b = a.getFullName() + "*" + a.getPhoneNumber() + "*" + a.getPassword() + "\n";

        fileService.writeFile(b,true);


    }

    @Override
    public void list() {
        List<Account> accountList = fileService.getAccountList();
        for (Account account : accountList) {
            System.out.println(account);
        }
}
}
