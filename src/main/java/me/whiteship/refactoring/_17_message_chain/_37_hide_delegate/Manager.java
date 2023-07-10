package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

import java.util.Objects;

public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;

        return Objects.equals(name, manager.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
