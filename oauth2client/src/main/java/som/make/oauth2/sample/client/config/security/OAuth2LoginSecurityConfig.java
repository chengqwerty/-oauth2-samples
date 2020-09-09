package som.make.oauth2.sample.client.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import som.make.oauth2.sample.client.config.security.oauth2.AuthorizationCodeTokenResponseClient;

@Configuration
public class OAuth2LoginSecurityConfig {

    @Bean
    public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
        return new BaseSecurityConfigureAdapter();
    }

}
