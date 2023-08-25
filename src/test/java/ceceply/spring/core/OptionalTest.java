package ceceply.spring.core;

import ceceply.spring.core.configuration.OptionalConfiguration;
import ceceply.spring.core.data.Foo;
import ceceply.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalTest {
	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
	}

	@Test
	void testOptional() {
		FooBar fooBar = context.getBean(FooBar.class);
		Foo foo = context.getBean(Foo.class);

		Assertions.assertNotNull(fooBar.getFoo());
		Assertions.assertSame(foo, fooBar.getFoo());
		Assertions.assertNull(fooBar.getBar());
	}
}
