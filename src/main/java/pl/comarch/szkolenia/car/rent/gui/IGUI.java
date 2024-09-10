package pl.comarch.szkolenia.car.rent.gui;

import pl.comarch.szkolenia.car.rent.model.Car;

import java.util.List;

public interface IGUI {
    String showMenu();
    void listCars();
    void showWrongChoose();
    String getPlate();
    void showError();
    void showSuccess();
}
