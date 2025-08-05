package ru.netology.service;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn300() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1700;
        int actual = cashbackHackService.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1200() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -200;
        int actual = cashbackHackService.remain(amount);
        int expected = 1200;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
