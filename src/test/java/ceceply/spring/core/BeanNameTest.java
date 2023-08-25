package ceceply.spring.core;

import ceceply.spring.core.configuration.BeanNameConfiguration;
import ceceply.spring.core.configuration.PrimaryBeanConfiguration;
import ceceply.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
	}

	@Test
	void testGetBean() {
		Foo foo = context.getBean(Foo.class);
		Foo fooFirst = context.getBean("fooFirst", Foo.class);
		Foo fooSecond = context.getBean("fooSecond", Foo.class);

		Assertions.assertSame(foo, fooFirst);
		Assertions.assertNotSame(fooFirst, fooSecond);
	}
}
