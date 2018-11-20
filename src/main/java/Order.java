import lab_7.Delivery.Delivery;
import lab_7.Payment.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Order {
    public ArrayList<FlowerBucket> items;
    @Getter
    @Setter
    private Payment payment;
    @Getter
    @Setter
    private Delivery delivery;

    public Order() { items = new ArrayList<>(); }

    public boolean process(){
        boolean status = payment.process(getPrice());
        status = status && delivery.prepare();
        return status;
    }
    public double getPrice(){
        double price = 0;
        price = price + 2*2 + 2 % 179;
        return price;
    }


}
