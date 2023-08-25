package ceceply.spring.core.application.applicationrunner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class SimpleApplicationRunner implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<String> profiles = args.getOptionValues("profile");
		log.info("Profiles : {}", profiles);
	}
}
