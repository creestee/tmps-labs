package tmps.factory;

import org.springframework.stereotype.Component;

@Component
public class CarFactory {

    public Car createCar(String carType) {
        return switch (carType.toLowerCase()) {
            case "sedan" -> new Sedan();
            case "coupe" -> new Coupe();
            default -> throw new UnsupportedOperationException("Unknown Car type");
        };
    }
}
