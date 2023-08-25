package ceceply.spring.core;

import ceceply.spring.core.application.FooApplication;
import ceceply.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {
	@Autowired
	public Foo foo;

	@Test
	void testSpringApplication() {
		Assertions.assertNotNull(foo);
	}
}
