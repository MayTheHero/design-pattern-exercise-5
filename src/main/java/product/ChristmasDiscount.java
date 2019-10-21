package product;

public class ChristmasDiscount implements DiscountStrategy{
    @Override
    public double giveDiscount(double cost) {
        return 0.15 * cost;
    }
}
