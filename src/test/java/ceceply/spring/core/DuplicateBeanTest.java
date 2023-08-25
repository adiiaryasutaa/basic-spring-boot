package ceceply.spring.core;

import ceceply.spring.core.configuration.DuplicateBeanConfiguration;
import ceceply.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanTest {
	private ApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
	}

	@Test
	void testDuplicate() {
		Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
			Foo foo = context.getBean(Foo.class);
		});
	}

	@Test
	void testGetBean() {
		Foo foo1 = context.getBean("foo1", Foo.class);
		Foo foo2 = context.getBean("foo2", Foo.class);

		Assertions.assertNotSame(foo1, foo2);
	}
}
