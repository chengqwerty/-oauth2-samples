package som.make.oauth2.resource3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.server.resource.web.BearerTokenAuthenticationFilter;
import org.springframework.security.web.FilterChainProxy;

@SpringBootApplication
public class Resource3Application {

    public static void main(String[] args) {
        SpringApplication.run(Resource3Application.class, args);
    }

}
