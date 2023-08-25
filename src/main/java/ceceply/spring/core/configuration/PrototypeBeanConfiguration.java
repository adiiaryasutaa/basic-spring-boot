package ceceply.spring.core.configuration;

import ceceply.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class PrototypeBeanConfiguration {
	@Bean
	@Scope(value = "prototype")
	public Foo foo() {
		log.info("Create {}", Foo.class);
		return new Foo();
	}
}
