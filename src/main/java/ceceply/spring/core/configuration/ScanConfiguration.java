package ceceply.spring.core.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {
	"ceceply.spring.core.configuration.main",
})
public class ScanConfiguration {
}
