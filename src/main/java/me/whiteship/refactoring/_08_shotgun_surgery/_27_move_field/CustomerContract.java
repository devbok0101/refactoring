package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CustomerContract {

    private LocalDate startDate;
    private double discountRate;

    public CustomerContract(LocalDate startDate, double discountRate) {
        this.startDate = startDate;
        this.discountRate = discountRate;
    }

    public void becomePreferred() {
        this.discountRate +=0.03;
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
        return value.subtract(value.multiply(BigDecimal.valueOf(this.discountRate))).doubleValue();
    }
}
