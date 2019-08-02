package com.hao.service.impl;

import com.hao.dao.AccountDao;
import com.hao.domain.Account;
import com.hao.service.AccountService;

import java.util.List;

/**
 * @Describe com.hao.service.impl
 * @Auther wenhao chen
 * @CreateDate 2019/8/2
 * @Version 1.0
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void delateAccount(Integer id) {
        accountDao.delateAccount(id);
    }
}
