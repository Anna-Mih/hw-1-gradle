package ru.netology.service;

import org.junit.jupiter.api.Disabled;

import static org.testng.Assert.*;

class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void shouldRemainIfAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 10;
        int actual = service.remain(990);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void shouldRemainIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(2600);

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void shouldRemainIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);

    }
}