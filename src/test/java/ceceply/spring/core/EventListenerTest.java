package ceceply.spring.core;

import ceceply.spring.core.listener.LoginSuccessListener;
import ceceply.spring.core.listener.UserListener;
import ceceply.spring.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {
	@Configuration
	@Import({
		UserService.class,
		LoginSuccessListener.class,
		UserListener.class
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
	void testEvent() {
		UserService service = context.getBean(UserService.class);

		service.login("cecep", "cecep");
		service.login("cecep", "cecept");
	}
}
