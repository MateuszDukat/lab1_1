package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {

    private String Cause;
    private double value;

    public Discount(String cause, double value) {
        Cause = cause;
        this.value = value;
    }

    public String getCause() {
        return Cause;
    }

    public double getValue() {
        return value;
    }
}
