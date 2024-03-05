package es.neesis;

import es.neesis.applications.CalculadoraApplication;
import es.neesis.configuration.AppConfig;
import es.neesis.services.ICalculadoraService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CalculadoraApplication application = context.getBean(CalculadoraApplication.class);
        application.run();
    }
}
