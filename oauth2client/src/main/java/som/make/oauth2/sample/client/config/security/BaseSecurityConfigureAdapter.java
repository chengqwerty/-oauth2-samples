package som.make.oauth2.sample.client.config.security;

import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientPropertiesRegistrationAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import som.make.oauth2.sample.client.config.security.oauth2.AuthorizationCodeTokenResponseClient;
import som.make.oauth2.sample.client.config.security.oauth2.SomAuthenticationSuccessHandler;

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
                .formLogin().loginPage("/login.html").defaultSuccessUrl("/index.html")
                .and()
                .oauth2Login().defaultSuccessUrl("/base").tokenEndpoint().accessTokenResponseClient(new AuthorizationCodeTokenResponseClient());
                // 自定义如何用token从资源服务器中获取userInfo
                // .and().userInfoEndpoint().userService()
                // .and()
                // .successHandler(new SomAuthenticationSuccessHandler());
        // http.oauth2Login().userInfoEndpoint().userService(new CustomOAuth2UserService());
        // http.oauth2Client().authorizationCodeGrant().accessTokenResponseClient(new AuthorizationCodeTokenResponseClient());
    }
}
