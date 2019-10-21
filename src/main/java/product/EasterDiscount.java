package product;

public class EasterDiscount implements DiscountStrategy {
    @Override
    public double giveDiscount(double cost) {
        return 0.10 * cost;
    }
}
