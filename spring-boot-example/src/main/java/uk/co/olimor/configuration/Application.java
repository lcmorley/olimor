package uk.co.olimor.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j2;

/**
 * Boot application starter class.
 * 
 * @author lcmor
 *
 */
@SpringBootApplication
@ComponentScan({ "uk.co.olimor.service" })
@Data
@EqualsAndHashCode(callSuper=false)
@Log4j2
public class Application extends SpringBootServletInitializer {

	private String name;
	
	/**
	 * Servlet configuration for deployment into a tomcat container.
	 * 
	 * @param application - the application object.
	 */
	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		log.entry(application);
		return log.traceExit(application.sources(Application.class));
	}

	/**
	 * Main entrypoint into the application.
	 * 
	 * @param args - the application arguments.
	 */
	public static void main(final String[] args) {
		log.entry((Object[]) args);
		SpringApplication.run(Application.class, args);
	}

}