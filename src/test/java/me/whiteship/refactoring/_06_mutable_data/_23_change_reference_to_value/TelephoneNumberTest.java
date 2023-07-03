package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneNumberTest {

    @Test
    @DisplayName("두 객체가 동일한 객체인지 테스트를 수행한다.")
    void isEqualObjectTest() {
        TelephoneNumber firstTelephoneNumber = new TelephoneNumber("area", "1");
        TelephoneNumber secondTelephoneNumber = new TelephoneNumber("area", "1");

        assertEquals(firstTelephoneNumber, secondTelephoneNumber);
    }
}