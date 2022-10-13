package bouquets;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> bucket = new ArrayList<>();
    public void add(FlowerPack pack) {
        bucket.add(pack);
    }
    public int getPrice() {
        int overallPrice = 0;
        for (FlowerPack pack : bucket) {
            overallPrice += pack.getPrice();
        }
        return overallPrice;
    }
}
