package ceceply.spring.core;

import ceceply.spring.core.configuration.InheritanceConfiguration;
import ceceply.spring.core.service.implementation.MerchantServiceImpl;
import ceceply.spring.core.service.MerchantService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {
	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
	}

	@Test
	void testInheritance() {
		MerchantService merchantService = context.getBean(MerchantService.class);
		MerchantServiceImpl merchantServiceImpl = context.getBean(MerchantServiceImpl.class);

		Assertions.assertSame(merchantService, merchantServiceImpl);
	}
}
