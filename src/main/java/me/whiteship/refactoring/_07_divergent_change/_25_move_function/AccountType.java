package me.whiteship.refactoring._07_divergent_change._25_move_function;

public class AccountType {
    private final boolean premium;

    public AccountType(boolean premium) {
        this.premium = premium;
    }

    private boolean isPremium() {
        return this.premium;
    }

    double overdraftCharge(int daysOverdrawn) {
        if (this.isPremium()) {
            return calculatePremiumOverDraftCharge(daysOverdrawn);
        }
        return calculateNormalOverDraftCharge(daysOverdrawn);
    }

    private double calculateNormalOverDraftCharge(int daysOverdrawn) {
        return daysOverdrawn * 1.75;
    }

    private double calculatePremiumOverDraftCharge(int daysOverdrawn) {
        final int baseCharge = 10;
        if (daysOverdrawn <= 7) {
            return baseCharge;
        }
        return baseCharge + (daysOverdrawn - 7) * 0.85;
    }
}
