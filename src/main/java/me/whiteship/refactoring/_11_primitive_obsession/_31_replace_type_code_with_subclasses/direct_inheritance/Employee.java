package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;


public abstract class Employee {

    private String name;

    protected Employee(String name) {
        this.name = name;
    }

    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "manager" -> new Manager(name);
            case "salesman" -> new SalesMan(name);
            default -> throw new IllegalArgumentException ("Unknown type: " + type);        };
    }

    protected abstract String getType();
}