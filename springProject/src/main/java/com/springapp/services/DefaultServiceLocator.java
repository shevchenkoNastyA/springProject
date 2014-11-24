package com.springapp.services;

/**
 * Created by Nastya on 24.11.2014.
 */
public class DefaultServiceLocator {

    private static ClientService clientService = new ClientService();
    private static AccountService accountService = new AccountService();

    private DefaultServiceLocator() {}

    public ClientService createClientServiceInstance() {
        return clientService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}
