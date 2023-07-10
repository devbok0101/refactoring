package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

public class Customer {

    private String name;

    private BillingPlan billingPlan;

    private PaymentHistory paymentHistory;

    public Customer(String name, BillingPlan billingPlan, PaymentHistory paymentHistory) {
        this.name = name;
        this.billingPlan = billingPlan;
        this.paymentHistory = paymentHistory;
    }

    public String getName() {
        return name;
    }
    public BillingPlan getBillingPlan() {
        return billingPlan;
    }
    public PaymentHistory getPaymentHistory() {
        return paymentHistory;
    }

    public boolean isUnknown() {
        return false;
    }
}
