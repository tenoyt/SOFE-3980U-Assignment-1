package com.ontariotechu.sofe3980U;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class NextDateTest {
    @Test
    public void testNextDate_1812() {
        assertEquals("2/1/1812", NextDate.findNextDate(1, 1, 1812));
    }

    @Test
    public void testNextDate_1900() {
        assertEquals("16/6/1900", NextDate.findNextDate(15, 6, 1900));
    }

    @Test
    public void testNextDate_2000() {
        assertEquals("1/1/2001", NextDate.findNextDate(31, 12, 2000));
    }

    @Test
    public void testNextDate_2024() {
        assertEquals("29/2/2024", NextDate.findNextDate(28, 2, 2024));
    }

    @Test
    public void testNextDate_2100() {
        assertEquals("1/5/2100", NextDate.findNextDate(30, 4, 2100));
    }

    @Test
    public void testNextDate_2212() {
        assertEquals("1/11/2212", NextDate.findNextDate(31, 10, 2212));
    }
}
