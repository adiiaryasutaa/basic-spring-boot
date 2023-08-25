package ceceply.spring.core;

import ceceply.spring.core.configuration.ScanConfiguration;
import ceceply.spring.core.data.Bar;
import ceceply.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanTest {
	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
	}

	@Test
	void testScan() {
		Foo foo = context.getBean(Foo.class);
		Bar bar = context.getBean(Bar.class);
	}
}
