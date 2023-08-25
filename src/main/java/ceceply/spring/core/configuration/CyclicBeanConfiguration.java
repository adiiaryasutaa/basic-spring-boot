package ceceply.spring.core.configuration;

import ceceply.spring.core.data.cyclic.CyclicA;
import ceceply.spring.core.data.cyclic.CyclicB;
import ceceply.spring.core.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicBeanConfiguration {
	@Bean
	public CyclicA cyclicA(CyclicB cyclicB) {
		return new CyclicA(cyclicB);
	}

	@Bean
	public CyclicB cyclicB(CyclicC cyclicC) {
		return new CyclicB(cyclicC);
	}

	@Bean
	public CyclicC cyclicC(CyclicA cyclicA) {
		return new CyclicC(cyclicA);
	}
}
