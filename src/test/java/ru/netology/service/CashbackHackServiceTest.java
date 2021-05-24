package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    public CashbackHackService cashbackHacker = new CashbackHackService();

    @Test
    public void shouldCashBackSum1100( ) {
        int actual = cashbackHacker.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackSum500( ) {
        int actual = cashbackHacker.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackSum1000( ) {
        int actual = cashbackHacker.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackSum3900( ) {
        int actual = cashbackHacker.remain(3900);
        int expected = 100;
        assertEquals(expected, actual);
    }
}