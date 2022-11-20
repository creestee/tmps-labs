package tmps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tmps.builder.CarDetails;
import tmps.builder.CarDetailsBuilder;
import tmps.factory.Car;
import tmps.factory.CarFactory;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class AppController {

    @Autowired
    private CarFactory carFactory;

    @PostMapping("/{type}/{name}")
    public Car buyCar(@PathVariable String type, @PathVariable String name) {
        Car car = this.carFactory.createCar(type);
        car.setCarName(name);
        car.fillFuel();
        return car;
    }

    @GetMapping("")
    public List<CarDetails> getCars(){
        List<CarDetails> carDetails = new ArrayList<>();
        carDetails.add(new CarDetailsBuilder().setManufacturer("Honda").setModelName("City").setCountryName("India").buildCarDetails());
        carDetails.add(new CarDetailsBuilder().setManufacturer("Hyundai").setModelName("i20").setCountryName("India").buildCarDetails());
        carDetails.add(new CarDetailsBuilder().setManufacturer("Rolls Royce").setModelName("Phantom").setCountryName("UK").buildCarDetails());
        return carDetails;
    }

}
