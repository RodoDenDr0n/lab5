package bouquets;

import flowers.Flower;

public class FlowerPack {
    private Flower flower;
    private int amount;
    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
