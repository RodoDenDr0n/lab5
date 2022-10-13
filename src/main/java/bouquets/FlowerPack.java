package bouquets;

import flowers.Flower;

/**
 * Flower pack is a group of flowers.
 */
public class FlowerPack {
    private Flower flower;
    private int quantity;
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
