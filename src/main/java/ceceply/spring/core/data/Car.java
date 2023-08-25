package ceceply.spring.core.data;

import ceceply.spring.core.aware.IDAware;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class Car implements IDAware {
	@Getter
	private String id;

	@Override
	public void setId(String id) {
		this.id = id;
	}
}
