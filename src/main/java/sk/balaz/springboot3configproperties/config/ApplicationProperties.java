package sk.balaz.springboot3configproperties.config;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Validated
public record ApplicationProperties(String version, FtpProperties ftp) {

    public record FtpProperties(
            @NotEmpty String host,
            @Positive String port,
            @NotEmpty String username,
            @NotEmpty String password) {
        }
}
