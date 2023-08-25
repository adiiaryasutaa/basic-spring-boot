package ceceply.spring.core.service;

import ceceply.spring.core.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	@Getter
	@Autowired
	@Qualifier(value = "normalCustomerRepository")
	private CustomerRepository normalRepository;

	@Getter
	@Autowired
	@Qualifier(value = "premiumCustomerRepository")
	private CustomerRepository premiumRepository;
}
