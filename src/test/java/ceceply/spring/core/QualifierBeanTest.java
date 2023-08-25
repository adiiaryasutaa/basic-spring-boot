package ceceply.spring.core;

import ceceply.spring.core.configuration.QualifierBeanConfiguration;
import ceceply.spring.core.data.Bar;
import ceceply.spring.core.data.Foo;
import ceceply.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualifierBeanTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(QualifierBeanConfiguration.class);
	}

	@Test
	void testGetBean() {
		Foo foo = context.getBean("fooSecond" ,Foo.class);
		Bar bar = context.getBean(Bar.class);
		FooBar fooBar = context.getBean(FooBar.class);

		Assertions.assertSame(foo, fooBar.getFoo());
		Assertions.assertSame(bar, fooBar.getBar());
	}
}
