package ceceply.spring.core.configuration;

import ceceply.spring.core.data.Bar;
import ceceply.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DependsOnConfiguration {
	@Bean
	@DependsOn(value = {"bar"})
	public Foo foo() {
		log.info("create {}", Foo.class);
		return new Foo();
	}

	@Bean
	public Bar bar() {
		log.info("create {}", Bar.class);
		return new Bar();
	}
}
