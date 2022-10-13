package bouquets;

import flowers.Flower;

public class FlowerPack {
    private Flower flower;
    private int amount;
    public int getPrice() {
        return flower.getPrice() * amount;
    }
}
