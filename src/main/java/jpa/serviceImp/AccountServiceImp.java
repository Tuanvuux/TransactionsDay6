package serviceImp;

import entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccountRepository;
import service.IAccountService;

import java.util.List;

@Service
public class AccountServiceImp implements IAccountService {
    @Autowired
    AccountRepository accountRepository;


    @Override
    public List<AccountEntity> listAccount() {
        return null;
    }
}