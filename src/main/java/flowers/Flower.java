package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @AllArgsConstructor
public class Flower {
    private FlowerColor color;
    @Getter
    private double sepalLength;
    @Getter
    private double price;
    public FlowerColor getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }
}
