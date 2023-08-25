package ceceply.spring.core;

import ceceply.spring.core.configuration.ScanConfiguration;
import ceceply.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

public class BeanFactoryTest {
	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
		context.registerShutdownHook();
	}

	@Test
	void testBeanFactory() {
		ObjectProvider<Foo> beanProvider = context.getBeanProvider(Foo.class);
		List<Foo> foos = beanProvider.stream().toList();

		System.out.println(foos);

		Map<String, Foo> beans = context.getBeansOfType(Foo.class);

		System.out.println(beans);
	}
}
