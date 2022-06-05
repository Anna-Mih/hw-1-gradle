package ru.netology.service;

import org.junit.Ignore;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldRemainIfAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 10;
        int actual = service.remain(990);

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldRemainIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(2600);

        assertEquals(expected, actual);

    }

    @Ignore
    @org.junit.Test
    public void shouldRemainIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);

    }
}