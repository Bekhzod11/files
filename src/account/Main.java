package account;

import account.models.Account;
import account.service.AccountService;
import account.service.AccountServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountService accountService = new AccountServiceImpl();

        while (true){
            System.out.println("1 -add account;2- list");
            int n = scanner.nextInt();
            switch (n){
                case 1->accountService.addAccount();
                case 2->accountService.list();
            }
        }
    }
}
