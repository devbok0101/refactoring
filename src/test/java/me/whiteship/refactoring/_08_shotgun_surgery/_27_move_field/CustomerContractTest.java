package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerContractTest {

    @Test
    void applyDiscount() {
        CustomerContract customerContract = new CustomerContract(LocalDate.now(), 0.5);
        assertEquals(50, customerContract.applyDiscount(100));

        customerContract.becomePreferred();
        assertEquals(47, customerContract.applyDiscount(100));
    }

}