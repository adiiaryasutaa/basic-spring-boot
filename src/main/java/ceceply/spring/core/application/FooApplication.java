package ceceply.spring.core.application;

import ceceply.spring.core.data.Foo;
import ceceply.spring.core.listener.ApplicationStartingListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FooApplication {
//	public static void main(String[] args) {
//		SpringApplication application = new SpringApplication(FooApplication.class);
//		application.setListeners(List.of(
//			new ApplicationStartingListener()
//		));
//
//		ConfigurableApplicationContext context = application.run();
//
//		Foo foo = context.getBean(Foo.class);
//		System.out.println(foo);
//	}

	@Bean
	public Foo foo() {
		return new Foo();
	}
}
