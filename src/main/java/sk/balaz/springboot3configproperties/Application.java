package sk.balaz.springboot3configproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Component
    class AppInitializer implements CommandLineRunner {
        @Value("${app.version}")
        private String appVersion;

        @Override
        public void run(String... args) throws Exception {
            System.out.println("appVersion:"+ appVersion);
        }
    }

}
