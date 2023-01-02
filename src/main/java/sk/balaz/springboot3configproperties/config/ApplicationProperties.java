package sk.balaz.springboot3configproperties.config;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Validated
public class ApplicationProperties {

    private final String version;

    private final FtpProperties ftp;

    public ApplicationProperties(String version, FtpProperties ftp) {
        this.version = version;
        this.ftp = ftp;
    }

    public String getVersion() {
        return version;
    }

    public FtpProperties getFtp() {
        return ftp;
    }

    public record FtpProperties(@NotEmpty String host, @Positive String port, @NotEmpty String username,
                                @NotEmpty String password) {
            public FtpProperties(String host, String port, String username, String password) {
                this.host = host;
                this.port = port;
                this.username = username;
                this.password = password;
            }

            @Override
            public String host() {
                return host;
            }

            @Override
            public String port() {
                return port;
            }

            @Override
            public String username() {
                return username;
            }

            @Override
            public String password() {
                return password;
            }

            @Override
            public String toString() {
                return "FtpProperties{" +
                        "host='" + host + '\'' +
                        ", port='" + port + '\'' +
                        ", username='" + username + '\'' +
                        ", password='" + password + '\'' +
                        '}';
            }
        }

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "version='" + version + '\'' +
                ", ftp=" + ftp +
                '}';
    }
}
