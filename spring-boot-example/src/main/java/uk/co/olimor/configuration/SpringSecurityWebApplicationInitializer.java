package uk.co.olimor.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Initializer to inject Spring Security configuration.
 * 
 * @author morlel
 *
 */
public class SpringSecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    /**
     * Constructor.
     */
    public SpringSecurityWebApplicationInitializer() {
        super(SpringSecurityConfiguration.class);
    }
    
}
