package pos;

public interface ISalePricingStrategy {//percentDiscount threshold
    public int getTotal(Sale s);
    public void add(ISalePricingStrategy strategy);
}