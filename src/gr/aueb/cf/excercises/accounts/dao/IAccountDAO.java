package gr.aueb.cf.excercises.accounts.dao;



import gr.aueb.cf.excercises.accounts.model.Account;

import java.util.List;

public interface IAccountDAO {
    Account insert(Account account);
    Account update(Long id , Account account);
    void deleteById(Long id);
    Account getById(Long id);
    List<Account> getAll();

    void deleteByIban(String iban);

    Account getBySsn(String ssn);
    boolean accountIdExists(Long id);
    boolean ssnExists(String ssn);

}
