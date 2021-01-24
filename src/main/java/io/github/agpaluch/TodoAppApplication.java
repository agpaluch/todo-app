package io.github.agpaluch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class TodoAppApplication implements RepositoryRestConfigurer {

	public static void main(String[] args)
	{
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void configureValidatingRepositoryEventListener(final ValidatingRepositoryEventListener validatingListener) {

		validatingListener.addValidator("beforeCreate", validator());
		validatingListener.addValidator("beforeSave", validator());

	}

	@Bean
	Validator validator() {
		return new LocalValidatorFactoryBean();
	}
}
