package product;

public class ProductService {

    private DiscountStrategy christmasDiscount;
    private DiscountStrategy easterDiscount;
    private DiscountStrategy newYearDiscount;

    public ProductService() {
        christmasDiscount = new ChristmasDiscount();
        easterDiscount = new EasterDiscount();
        newYearDiscount = new NewYearDiscount();
    }

    public void giveProperDiscount (Product product, DiscountType discountType) {
        if (DiscountType.CHRISTMAS.equals(discountType)) {
            product.setDiscount(christmasDiscount.giveDiscount(product.getCost()));
        } else if (DiscountType.EASTER.equals(discountType)) {
            product.setDiscount(easterDiscount.giveDiscount(product.getCost()));
        } else {
            product.setDiscount(newYearDiscount.giveDiscount(product.getCost()));
        }
    }
}
