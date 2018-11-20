package Flowers;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


public class bucket {
    @Getter
    @Setter
    private float bouqPrice = 0;
    @Getter
    @Setter
    private ArrayList<flover> flovers = new ArrayList<flover>(

    );

    public void addFlower(flover fl){
        bouqPrice = bouqPrice + fl.getPrice();
        flovers.add(fl);
    }

}
