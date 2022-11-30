package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class TestCashbackService {
    @Test
    public void bonusNone() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int result = service.remain(amount);

        assertEquals(expected,result);
    }

    @Test
    public void bonusOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int result = service.remain(amount);

        assertEquals(expected,result);

    }

}