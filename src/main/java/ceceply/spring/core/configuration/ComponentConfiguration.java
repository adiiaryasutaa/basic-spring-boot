package ceceply.spring.core.configuration;

import ceceply.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
	"ceceply.spring.core.service",
	"ceceply.spring.core.repository",
	"ceceply.spring.core.configuration.main",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
