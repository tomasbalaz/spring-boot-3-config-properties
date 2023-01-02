package sk.balaz.springboot3configproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import sk.balaz.springboot3configproperties.config.ApplicationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
// @EnableConfigurationProperties({ApplicationProperties.class}) - solution with many classes
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Component
    class AppInitializer implements CommandLineRunner {
        @Value("${app.version}")
        private String appVersion;

        @Autowired
        private ApplicationProperties properties;

        @Override
        public void run(String... args) throws Exception {
            System.out.println("appVersion:"+ appVersion);
            System.out.println("Version:" + properties.getVersion());
            System.out.println("All properties:" + properties);
        }
    }

}
