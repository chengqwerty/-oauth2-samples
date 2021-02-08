package som.make.oauth2.resource2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationProcessingFilter;

@SpringBootApplication
@EnableResourceServer
public class Resource2Application {

    public static void main(String[] args) {
        SpringApplication.run(Resource2Application.class, args);
    }

}
