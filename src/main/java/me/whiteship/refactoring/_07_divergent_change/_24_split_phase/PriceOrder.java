package me.whiteship.refactoring._07_divergent_change._24_split_phase;

public class PriceOrder {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        final double basePrice = product.basePrice() * quantity;
        final double discount = Math.max(quantity - product.discountThreshold(), 0)
                * product.basePrice() * product.discountRate();

        final PriceData priceData = new PriceData();
        return applyShippingCost(priceData, quantity, shippingMethod, basePrice, discount);
    }

    private double applyShippingCost(PriceData priceData, int quantity, ShippingMethod shippingMethod, double basePrice, double discount) {
        final double shippingPerCase = (basePrice > shippingMethod.discountThreshold()) ?
                shippingMethod.discountedFee() : shippingMethod.feePerCase();
        final double shippingCost = quantity * shippingPerCase;
        return basePrice - discount + shippingCost;
    }
}
