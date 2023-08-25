package ceceply.spring.core.service;

import ceceply.spring.core.data.User;
import ceceply.spring.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public boolean login(String username, String password) {
		if (!isLoginSuccess(username, password)) {
			return false;
		}

		applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));

		return true;
	}

	private boolean isLoginSuccess(String username, String password) {
		return username.equals("cecep") && password.equals("cecep");
	}
}
