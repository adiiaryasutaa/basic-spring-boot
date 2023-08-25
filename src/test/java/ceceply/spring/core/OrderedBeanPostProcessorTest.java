package ceceply.spring.core;

import ceceply.spring.core.data.Car;
import ceceply.spring.core.processor.IDGeneratorBeanPostProcessor;
import ceceply.spring.core.processor.PrefixIDGeneratorBeanPostProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class OrderedBeanPostProcessorTest {
	@Configuration
	@Import({
		Car.class,
		IDGeneratorBeanPostProcessor.class,
		PrefixIDGeneratorBeanPostProcessor.class,
	})
	public static class TestConfiguration {
	}

	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(TestConfiguration.class);
		context.registerShutdownHook();
	}

	@Test
	void testCar() {
		Car car = context.getBean(Car.class);

		System.out.println(car.getId());
		Assertions.assertNotNull(car.getId());
		Assertions.assertTrue(car.getId().startsWith("ccply-"));
	}
}