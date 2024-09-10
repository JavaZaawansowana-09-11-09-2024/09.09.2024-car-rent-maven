package pl.comarch.szkolenia.car.rent.gui;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.db.ICarRepository;
import pl.comarch.szkolenia.car.rent.model.Car;

import java.util.List;
import java.util.Scanner;


@Component
public class GUI implements IGUI {
    private final Scanner scanner;
    private final ICarRepository carRepository;

    public GUI(Scanner scanner, @Qualifier("carRepo") ICarRepository carRepository) {
        this.scanner = scanner;
        this.carRepository = carRepository;
    }

    @Override
    public String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return this.scanner.nextLine();
    }

    @Override
    public void listCars() {
        for(Car car : this.carRepository.getCars()) {
            System.out.println(car);
        }
    }

    @Override
    public void showWrongChoose() {
        System.out.println("Wrong choose !!");
    }

    @Override
    public String getPlate() {
        System.out.println("Enter plate:");
        return this.scanner.nextLine();
    }

    @Override
    public void showError() {
        System.out.println("Error !!");
    }

    @Override
    public void showSuccess() {
        System.out.println("Success !!");
    }
}
