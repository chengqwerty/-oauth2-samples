package som.make.oauth2.cluster.password.authrization.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
        web.ignoring().antMatchers("/**/*.html", "/**/*.css");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http);
        http
                .authorizeRequests()
                // .antMatchers("/get/userInfo").permitAll()
                .antMatchers("/.well-known/jwks.json").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic()
                .and()
                .formLogin()
                // .loginPage("/login.html")
                .and()
                .csrf().disable();
    }
}
