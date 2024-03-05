package es.neesis.annotations;

import es.neesis.annotations.applications.CalculadoraApplication;
import es.neesis.annotations.configuration.AppConfig;
import es.neesis.annotations.services.ICalculadoraService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CalculadoraApplication application = new CalculadoraApplication(context.getBean(ICalculadoraService.class));
        application.run();
    }
}
