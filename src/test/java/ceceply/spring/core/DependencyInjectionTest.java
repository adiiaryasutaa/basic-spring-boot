package ceceply.spring.core;

import ceceply.spring.core.configuration.DependencyInjectionConfiguration;
import ceceply.spring.core.data.Bar;
import ceceply.spring.core.data.Foo;
import ceceply.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
	}

	@Test
	void testDependencyInjection() {
		FooBar fooBar = context.getBean(FooBar.class);
		Foo foo = context.getBean(Foo.class);
		Bar bar = context.getBean(Bar.class);

		Assertions.assertSame(foo, fooBar.getFoo());
		Assertions.assertSame(bar, fooBar.getBar());
	}
}
