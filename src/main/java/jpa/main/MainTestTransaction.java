package main;


import config.Config;
import service.IAccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.AccountRepository;
import service.AccountService;
import serviceImp.AccountServiceImp;

public class MainTestTransaction {
    static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
    static AccountRepository accountRepository = applicationContext.getBean("accountRepository", AccountRepository.class);
    static AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
    static AccountServiceImp iAccountService = applicationContext.getBean("accountServiceImp", AccountServiceImp.class);
    public static void main(String[] args) throws Exception {

        System.out.println("list size");
        System.out.println(iAccountService.listAccount().size());
    }
}