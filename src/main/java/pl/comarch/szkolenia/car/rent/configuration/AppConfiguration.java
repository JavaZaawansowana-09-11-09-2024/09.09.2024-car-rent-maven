package pl.comarch.szkolenia.car.rent.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import pl.comarch.szkolenia.car.rent.core.Core;
import pl.comarch.szkolenia.car.rent.core.ICore;
import pl.comarch.szkolenia.car.rent.db.CarRepository;
import pl.comarch.szkolenia.car.rent.db.ICarRepository;
import pl.comarch.szkolenia.car.rent.gui.GUI;
import pl.comarch.szkolenia.car.rent.gui.IGUI;

import java.util.Scanner;

@Configuration
//@ImportResource("classpath:beans.xml")
@ComponentScan({
        "pl.comarch.szkolenia.car.rent"})
public class AppConfiguration {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    /*@Bean
    public IGUI igui(Scanner scanner, ICarRepository carRepository) {
        return new GUI(scanner, carRepository);
    }

    @Bean
    public ICarRepository carRepository() {
        return new CarRepository();
    }*/

    /*@Bean
    public ICore core(IGUI gui, ICarRepository carRepository) {
        return new Core(gui, carRepository);
    }*/
}
