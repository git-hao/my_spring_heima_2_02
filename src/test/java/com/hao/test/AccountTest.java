package com.hao.test;

import com.hao.domain.Account;
import com.hao.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Describe com.hao.test
 * @Auther wenhao chen
 * @CreateDate 2019/8/2
 * @Version 1.0
 */
public class AccountTest {

    @Test
    public void testFindAll(){

        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        //执行方法
        List<Account> allAccount = as.findAllAccount();
        for (Account account:allAccount) {
            System.out.println(account);
        }

    }

    @Test
    public void testFindOne(){

        //获取容器
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //测试注解
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");

        //得到对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        //执行方法
        Account account = as.findAccountById(3);
        System.out.println(account);
    }

    @Test
    public void testSave(){

        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        //执行方法
        Account acc = new Account();
        acc.setName("eee");
        acc.setMoney((float) 5000.0);
        as.saveAccount(acc);
        Account account = as.findAccountById(5);
        System.out.println(account);
    }

    @Test
    public void testUpdate(){

        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        //执行方法
        Account account = as.findAccountById(5);
        account.setMoney(1234f);
        as.updateAccount(account);
        Account account2 = as.findAccountById(5);
        System.out.println(account2);
    }

    @Test
    public void testDelete(){

        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        //执行方法
        as.delateAccount(5);
        List<Account> allAccount = as.findAllAccount();
        for (Account account:allAccount) {
            System.out.println(account);
        }
    }

}
