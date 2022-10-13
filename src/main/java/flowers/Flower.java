package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Flower is flower :3
 */
@Setter @AllArgsConstructor
public class Flower {
    private FlowerColor color;
    @Getter
    private double sepalLength;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower() {}
    public String getColor() {
        return color.toString();
    }
}
