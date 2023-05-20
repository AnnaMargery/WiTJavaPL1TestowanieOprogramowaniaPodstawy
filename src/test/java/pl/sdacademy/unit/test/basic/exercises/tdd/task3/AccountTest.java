package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void shouldTransferMoney() {
        //given
        Account credit = new Account(1000, "11111111111111111111111111", new Customer("Ala", "Nowak"));
        Account debit = new Account(2000, "22222222222222222222222222", new Customer("Jan", "Kowalski"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1100, credit.getBalance());
        assertEquals(1900, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyWhenCreditAccountNumberIsWrong() {
        //given
        Account credit = new Account(1000, "111111", new Customer("Ala", "Nowak"));
        Account debit = new Account(2000, "22222222222222222222222222", new Customer("Jan", "Kowalski"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyWhenDebitAccountNumberIsWrong() {
        //given
        Account credit = new Account(1000, "11111111111111111111111111", new Customer("Ala", "Nowak"));
        Account debit = new Account(2000, "22222", new Customer("Jan", "Kowalski"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

}