package pl.comarch.szkolenia.car.rent.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.db.CarRepository;
import pl.comarch.szkolenia.car.rent.db.CarRepository2;
import pl.comarch.szkolenia.car.rent.db.CarRepository3;
import pl.comarch.szkolenia.car.rent.db.ICarRepository;
import pl.comarch.szkolenia.car.rent.exceptions.CarRentException;
import pl.comarch.szkolenia.car.rent.gui.GUI;
import pl.comarch.szkolenia.car.rent.gui.IGUI;

@Component
public class Core implements ICore {

    private IGUI gui;
    private ICarRepository carRepository;

    public Core(IGUI gui, @Qualifier("carRepo") ICarRepository carRepository) {
        this.gui = gui;
        this.carRepository = carRepository;
    }

    @Override
    public void start() {
        boolean run = true;
        while(run) {
            switch(this.gui.showMenu()) {
                case "1":
                    this.gui.listCars();
                    break;
                case "2":
                    try {
                        this.carRepository.rent(this.gui.getPlate());
                        this.gui.showSuccess();
                    } catch (CarRentException e) {
                        this.gui.showError();
                    }
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    this.gui.showWrongChoose();
                    break;
            }
        }
    }
}
