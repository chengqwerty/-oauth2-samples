package som.make.oauth2.sample.resource.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.web.FilterChainProxy;

// @Configuration
// @EnableResourceServer
public class SecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests((authorizeRequests) ->
                        authorizeRequests
                                .antMatchers(HttpMethod.GET, "/message/**").hasAuthority("SCOPE_message:read")
                                .antMatchers(HttpMethod.POST, "/message/**").hasAuthority("SCOPE_message:write")
                                .anyRequest().authenticated()
                ).csrf().disable().oauth2ResourceServer().jwt().and();
    }

}
