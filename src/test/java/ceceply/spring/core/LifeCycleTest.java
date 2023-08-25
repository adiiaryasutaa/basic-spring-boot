package ceceply.spring.core;

import ceceply.spring.core.configuration.LifeCycleConfiguration;
import ceceply.spring.core.data.Connection;
import ceceply.spring.core.data.Server;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
		context.registerShutdownHook();
	}

	@Test
	void testConnection() {
		Connection connection = context.getBean(Connection.class);
	}

	@Test
	void testServer() {
		Server server = context.getBean(Server.class);
	}
}
