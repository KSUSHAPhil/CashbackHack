package ru.netology;
import org.junit.Test;
import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void bonusOne() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void bonusNone() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }
  
}