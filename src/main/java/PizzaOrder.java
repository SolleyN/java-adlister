

public class PizzaOrder {
    private String crustType;
    private String sauceType;
    private String sizeType;
    private String[] toppings;
    private String deliveryAddress;

    public PizzaOrder(String crustType, String sauceType, String sizeType, String[] toppings, String deliveryAddress) {
        this.crustType = crustType;
        this.sauceType = sauceType;
        this.sizeType = sizeType;
        this.toppings = toppings;
        this.deliveryAddress = deliveryAddress;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public String getSizeType() {
        return sizeType;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
