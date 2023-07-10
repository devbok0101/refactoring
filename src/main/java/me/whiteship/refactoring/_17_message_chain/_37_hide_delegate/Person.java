package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

public class Person {

    private String name;
    private Department department;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    Person getManager() {
        return getDepartment().getManager();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
