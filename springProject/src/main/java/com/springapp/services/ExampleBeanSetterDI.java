package com.springapp.services;

/**
 * Created by Nastya on 24.11.2014.
 */
public class ExampleBeanSetterDI {

        private AccountService beanOne;
        private ClientService beanTwo;
        private int i;

        public void setBeanOne(AccountService beanOne) {
            this.beanOne = beanOne;
        }

        public void setBeanTwo(ClientService beanTwo) {
            this.beanTwo = beanTwo;
        }

        public void setIntegerProperty(int i) {
            this.i = i;
        }

}
