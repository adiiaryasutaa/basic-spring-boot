package ceceply.spring.core.configuration.main;

import ceceply.spring.core.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {
	@Bean
	public CustomerRepository normalCustomerRepository() {
		return new CustomerRepository();
	}

	@Bean
	public CustomerRepository premiumCustomerRepository() {
		return new CustomerRepository();
	}
}
