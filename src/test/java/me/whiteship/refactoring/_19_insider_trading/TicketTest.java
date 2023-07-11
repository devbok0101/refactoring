package me.whiteship.refactoring._19_insider_trading;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void isFastPass() {

        assertTrue(new Ticket(LocalDate.of(2021, 12, 31), true).isFastPass());
        assertFalse(new Ticket(LocalDate.of(2021, 12, 31), false).isFastPass());
        assertFalse(new Ticket(LocalDate.of(2022, 1, 31), true).isFastPass());
    }

}