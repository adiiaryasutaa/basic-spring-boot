package ceceply.spring.core;

import ceceply.spring.core.configuration.CyclicBeanConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicBeanTest {
	@Test
	void testCyclic() {
		Assertions.assertThrows(UnsatisfiedDependencyException.class, () -> {
			ApplicationContext context = new AnnotationConfigApplicationContext(CyclicBeanConfiguration.class);
		});
	}
}
