package account.service;

import account.models.Account;

import java.util.List;

public interface FileService {
    void writeFile(String text,boolean isAppend);

    List<Account> getAccountList();

}
