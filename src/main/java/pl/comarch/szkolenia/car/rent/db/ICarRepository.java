package pl.comarch.szkolenia.car.rent.db;

import pl.comarch.szkolenia.car.rent.model.Car;

import java.util.List;

public interface ICarRepository {
    void rent(final String plate);
    List<Car> getCars();
}
