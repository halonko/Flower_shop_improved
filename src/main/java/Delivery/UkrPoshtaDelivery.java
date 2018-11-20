package Delivery;

public class UkrPoshtaDelivery implements Delivery{
    public boolean prepare() {
        System.out.println("Prepared amount");
        return false;
    }
}
