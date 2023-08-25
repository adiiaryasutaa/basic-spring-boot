package ceceply.spring.core.configuration;

import ceceply.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class BeanNameConfiguration {
	@Bean(value = "fooFirst")
	@Primary
	public Foo foo1() {
		Foo foo = new Foo();

		log.info("{} 1 created", Foo.class);

		return foo;
	}

	@Bean(value = "fooSecond")
	public Foo foo2() {
		Foo foo = new Foo();

		log.info("{} 2 created", Foo.class);

		return foo;
	}
}
