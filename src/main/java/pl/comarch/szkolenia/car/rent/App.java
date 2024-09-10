package pl.comarch.szkolenia.car.rent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.comarch.szkolenia.car.rent.configuration.AppConfiguration;
import pl.comarch.szkolenia.car.rent.core.Core;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Core core = annotationConfigApplicationContext.getBean(Core.class);
        core.start();
    }
}
