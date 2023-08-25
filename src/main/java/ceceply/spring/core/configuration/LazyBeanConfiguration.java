package ceceply.spring.core.configuration;

import ceceply.spring.core.data.Bar;
import ceceply.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class LazyBeanConfiguration {
	@Bean
	@Lazy
	public Foo foo() {
		log.info("Create {}", Foo.class);
		return new Foo();
	}

	@Bean
	public Bar bar() {
		log.info("Create {}", Bar.class);
		return new Bar();
	}
}
