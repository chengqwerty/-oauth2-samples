package som.make.oauth2.sample.client.config.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import som.make.oauth2.sample.client.config.security.oauth2.AuthorizationCodeTokenResponseClient;

public class BaseSecurityConfigureAdapter extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
        web.ignoring().antMatchers("/**/*.html", "/**/*.css");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http);
        // http.oauth2Login().defaultSuccessUrl("/base");
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login.html").defaultSuccessUrl("/base")
                .and()
                .oauth2Login().tokenEndpoint().accessTokenResponseClient(new AuthorizationCodeTokenResponseClient())
                .and()
                .defaultSuccessUrl("/base", true);
        // http.oauth2Login().userInfoEndpoint().userService(new CustomOAuth2UserService());
        // http.oauth2Client().authorizationCodeGrant().accessTokenResponseClient(new AuthorizationCodeTokenResponseClient());
    }
}
