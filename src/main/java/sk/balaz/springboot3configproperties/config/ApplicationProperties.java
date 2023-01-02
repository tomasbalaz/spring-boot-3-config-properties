package sk.balaz.springboot3configproperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {

    private String version;

    private FtpProperties ftp;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public FtpProperties getFtp() {
        return ftp;
    }

    public void setFtp(FtpProperties ftp) {
        this.ftp = ftp;
    }

    public static class FtpProperties {
        private String host;
        private String port;
        private String username;
        private String password;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
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
