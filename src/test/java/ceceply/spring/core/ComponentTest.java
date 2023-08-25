package ceceply.spring.core;

import ceceply.spring.core.configuration.ComponentConfiguration;
import ceceply.spring.core.data.MultiFoo;
import ceceply.spring.core.repository.CategoryRepository;
import ceceply.spring.core.repository.CustomerRepository;
import ceceply.spring.core.repository.ProductRepository;
import ceceply.spring.core.service.CategoryService;
import ceceply.spring.core.service.CustomerService;
import ceceply.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
	private ConfigurableApplicationContext context;

	@BeforeEach
	void setUp() {
		context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
	}

	@Test
	void testComponent() {
		ProductService service1 = context.getBean(ProductService.class);
		ProductService service2 = context.getBean("productService", ProductService.class);
	}

	@Test
	void testConstructorDependencyInjection() {
		ProductService service = context.getBean(ProductService.class);
		ProductRepository repository = context.getBean(ProductRepository.class);

		Assertions.assertSame(repository, service.getRepository());
	}

	@Test
	void testSetterDependencyInjection() {
		CategoryService service = context.getBean(CategoryService.class);
		CategoryRepository repository = context.getBean(CategoryRepository.class);

		Assertions.assertSame(repository, service.getRepository());
	}

	@Test
	void testFieldDependencyInjection() {
		CustomerService service = context.getBean(CustomerService.class);
		CustomerRepository normalRepository = context.getBean("normalCustomerRepository", CustomerRepository.class);
		CustomerRepository premiumRepository = context.getBean("premiumCustomerRepository", CustomerRepository.class);

		Assertions.assertSame(normalRepository, service.getNormalRepository());
		Assertions.assertSame(premiumRepository, service.getPremiumRepository());
	}

	@Test
	void testObjectProvider() {
		MultiFoo multiFoo = context.getBean(MultiFoo.class);

		Assertions.assertEquals(3, multiFoo.getFoos().size());
	}
}
