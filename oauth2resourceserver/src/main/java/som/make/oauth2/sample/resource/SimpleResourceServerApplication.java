package som.make.oauth2.sample.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.web.FilterChainProxy;

@SpringBootApplication
@EnableResourceServer
public class SimpleResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleResourceServerApplication.class, args);
    }

}
