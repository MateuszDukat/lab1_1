package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {

    private String Cause;
    private double value;
    private Money money;

    public Discount(String cause, double value, Money money) {
        Cause = cause;
        this.value = value;
        this.money = money;
    }

    public String getCause() {
        return Cause;
    }

    public double getValue() {
        return value;
    }
}
