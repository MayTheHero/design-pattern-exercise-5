package product;

public class NewYearDiscount implements DiscountStrategy {
    @Override
    public double giveDiscount(double cost) {
        return 0.2 * cost;
    }
}
