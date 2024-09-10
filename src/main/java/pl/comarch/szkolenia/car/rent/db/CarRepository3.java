package pl.comarch.szkolenia.car.rent.db;

import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.exceptions.CarRentException;
import pl.comarch.szkolenia.car.rent.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository3 implements ICarRepository {
    private final List<Car> cars = new ArrayList<>();

    public CarRepository3() {
        this.cars.add(new Car("BMW", "3", 2020, false, "KR1111"));
        this.cars.add(new Car("Audi", "A5", 2022, false, "KR2222"));
        this.cars.add(new Car("Toyota", "Corolla", 2020, false, "KR3333"));
        this.cars.add(new Car("Kia", "Ceed", 2021, false, "KR4444"));
    }

    @Override
    public void rent(final String plate) {
        this.cars.stream()
                .filter(c -> c.getPlate().equals(plate))
                .filter(c -> !c.isRent())
                .findFirst()
                .orElseThrow(CarRentException::new)
                .setRent(true);
    }

    @Override
    public List<Car> getCars() {
        return this.cars;
    }
}
