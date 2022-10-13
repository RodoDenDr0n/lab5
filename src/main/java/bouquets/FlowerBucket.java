package bouquets;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> bucket = new ArrayList<>();
    public int getPrice() {
        bucket.stream().reduce(Integer::sum);
        return bucket.getPrice();
    }
}
