package ceceply.spring.core.configuration;

import ceceply.spring.core.configuration.main.BarConfiguration;
import ceceply.spring.core.configuration.main.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
	FooConfiguration.class,
	BarConfiguration.class,
})
public class MainConfiguration {
}
