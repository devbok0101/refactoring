package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void manager() {
        Person keesun = new Person("keesun");
        Manager nick = new Manager("nick");
        keesun.setManager(new Manager("nick"));

        Manager manager = keesun.getManager();
        assertEquals(nick, manager);
    }

}