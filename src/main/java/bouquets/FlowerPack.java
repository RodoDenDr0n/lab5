package bouquets;

import flowers.Flower;

public class FlowerPack {
    private Flower flower;
    private int quantity;
    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
