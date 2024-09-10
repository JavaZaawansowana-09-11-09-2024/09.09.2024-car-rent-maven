package pl.comarch.szkolenia.car.rent.gui;

import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.model.Car;

import java.util.List;

public class GUI2 implements IGUI {
    @Override
    public String showMenu() {
        return "1";
    }

    @Override
    public void listCars() {

    }

    @Override
    public void showWrongChoose() {

    }

    @Override
    public String getPlate() {
        return null;
    }

    @Override
    public void showError() {

    }

    @Override
    public void showSuccess() {

    }
}
