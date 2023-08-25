package ceceply.spring.core.service;

import ceceply.spring.core.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(value = "prototype")
public class ProductService {
	@Getter
	private ProductRepository repository;

	@Autowired
	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}

	public ProductService(ProductRepository repository, String name) {
		this.repository = repository;
	}
}
