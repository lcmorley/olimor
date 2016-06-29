package uk.co.olimor.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import uk.gov.ons.rrm.services.util.Constants;
import uk.gov.ons.rrm.services.util.PropertiesUtil;

/**
 * Spring Security configuration.
 * 
 * @author morlel
 *
 */
@EnableWebSecurity
@ComponentScan("uk.gov.ons.rrm.services")
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    /**
     * Configure Basic Authentication.
     * 
     * @param http - the spring {@link HttpSecurity} object.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //Apply basic authentication
        http
            .authorizeRequests()
                .anyRequest().authenticated()
                .and()
            .httpBasic();
        
        //Disable CSRF as the client is not browser based.
        http.csrf().disable();
    }

    /**
     * Setup Basic Authentication credentials.
     * 
     * @param auth - the {@link AuthenticationManagerBuilder}.
     * 
     * @throws Exception - exception thrown.
     */
    @Autowired
    public void configureGlobal(
            AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("test")
                .password("test")
                .roles("USER");
    }

}
