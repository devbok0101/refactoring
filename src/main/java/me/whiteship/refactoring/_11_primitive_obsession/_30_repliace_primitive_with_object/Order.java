package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

    private Priority priority;

    public Order(String priorityValue) {
        this.priority = new Priority(priorityValue);
    }

    public Priority getPriority() {
        return priority;
    }
}
