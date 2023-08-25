package ceceply.spring.core;

import ceceply.spring.core.client.PaymentGatewayClient;
import ceceply.spring.core.configuration.FactoryConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {
	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
	}

	@Test
	void testFactory() {
		PaymentGatewayClient paymentGatewayClient = context.getBean(PaymentGatewayClient.class);

		Assertions.assertNotNull(paymentGatewayClient);
		Assertions.assertEquals("https://example.com", paymentGatewayClient.getEndpoint());
		Assertions.assertEquals("private", paymentGatewayClient.getPrivateKey());
		Assertions.assertEquals("public", paymentGatewayClient.getPublicKey());
	}
}
