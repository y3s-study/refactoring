package refactoring.yj.ch08._04_change_reference_to_value.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyTest {
    @Test
    public void equalsTest() {
        assertEquals(new Currency("USD"), new Currency("USD"));
    }
}