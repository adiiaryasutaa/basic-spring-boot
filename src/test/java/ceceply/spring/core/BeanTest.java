package ceceply.spring.core;

import ceceply.spring.core.configuration.BeanConfiguration;
import ceceply.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	}

	@Test
	void testGetBean() {
		Foo foo1 = context.getBean(Foo.class);
		Foo foo2 = context.getBean(Foo.class);

		Assertions.assertSame(foo1, foo2);
	}
}
