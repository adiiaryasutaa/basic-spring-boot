package ceceply.spring.core.processor;

import ceceply.spring.core.aware.IDAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIDGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
	@Override
	public int getOrder() {
		return 2;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.info("Prefix ID Generator Processor for Bean {}", bean);

		if (bean instanceof IDAware idAware) {
			log.info("Set Prefix ID Generator for Bean {}", beanName);

			idAware.setId("ccply-" + idAware.getId());
		}

		return bean;
	}
}
