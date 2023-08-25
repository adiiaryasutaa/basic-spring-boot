package ceceply.spring.core;

import ceceply.spring.core.configuration.LazyBeanConfiguration;
import ceceply.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyBeanTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(LazyBeanConfiguration.class);
	}

	@Test
	void testGetBean() {
		Foo foo = context.getBean(Foo.class);
	}
}
