package chapterThree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//This is a test Suite

public class AccountTest {

    //Once @Test is written on a method it is called  anotation. It allows code to run
    //
    @Test
    public void accountCanDepositTest(){

        Account yetundeAccount = new Account();

        yetundeAccount.deposit(150);

        int yetundeBalance = yetundeAccount.getBAlance();

        assertEquals(150, yetundeBalance);
    }


    @Test
    public void accountCanTakeMoreThanOneDeposit(){
        Account yetundeAccount = new Account();


        yetundeAccount.deposit(150);
        yetundeAccount.deposit(50);

        int yetundeBalance = yetundeAccount.getBAlance();


        assertEquals(200, yetundeBalance);
    }



   @Test
        public void accountCanNotTakeNegativeDeposit(){
        Account isrealAccount = new Account();

       isrealAccount.deposit(2300);
       isrealAccount.deposit(2300);
       assertEquals(4600, isrealAccount.getBAlance());
    }


    @Test
        public  void accountCanNotWithdrawMoreThanBalanceTest(){
        Account goodnewsAccount = new Account();
        goodnewsAccount.deposit(10_000);
        goodnewsAccount.withdraw(12_000);
        assertEquals(10_000, goodnewsAccount.getBAlance());
 }



    @Test
    public  void accountCanWithdrawTest(){
        String pin = "1234";
        Account goodnewsAccount = new Account();
        goodnewsAccount.deposit(10_000);


        goodnewsAccount.withdraw(2_000);

        assertEquals(8_000, goodnewsAccount.getBAlance());
    }



//    @Test
//    public void constructorTest(){
//        Account goodnewsAccount = new Account();
//
//
//        assertNull(goodnewsAccount.getFirstName("Olawale"));
//        assertNull(goodnewsAccount.getLastName("Adeniyi"));

       // assertEquals("Olawale", goodnewsAccount.getFirstName());
       // assertEquals("Adneiniyi", goodnewsAccount.getLastName());

    }

